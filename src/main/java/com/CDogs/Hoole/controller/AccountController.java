package com.CDogs.Hoole.controller;

import com.CDogs.Hoole.Util.Constellation;
import com.CDogs.Hoole.pojo.HooleAccountT;
import com.CDogs.Hoole.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
@Controller

public class AccountController {
    //注入Service类
    @Autowired
    private AccountService accountService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("account/get_all_accounts")
    public ModelAndView getAllAccounts()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        //调用service方法得到用户列表
        List<HooleAccountT> accounts = accountService.get_all_accounts();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("accounts",accounts);
        //设置响应的jsp视图
        modelAndView.setViewName("accounts");

        return modelAndView;
    }

    /**
     * 用户登录
     * @param accountname
     * @param password
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_account_login")
    public ModelAndView accountLogin(String accountname, String password,HttpSession session)throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //查找匹配的account
        HooleAccountT account = accountService.get_account_by_emailOrphoneAndpwd(accountname, password);

        if(null == account){
            //设置响应的jsp视图
            modelAndView.addObject("loginError","账号或密码错误");
            modelAndView.setViewName("Account/Hoole_loginError");
        }else{
            //将用户添加到session中
            session.setAttribute("account",account);
            //设置响应的jsp视图
            modelAndView.setViewName("Account/Hoole_index");
        }

        return modelAndView;
    }

    /**
     * 用户注册
     * @param accountname
     * @param password
     * @param birthday
     * @param sex
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_register", method = RequestMethod.POST)
    public ModelAndView accountSignup(String accountname, String password, String birthday, String sex)throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        HooleAccountT account = new HooleAccountT();
        account.setPersonPassword(password);
        //邮箱
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            account.setPersonEmail(accountname);
            if(null != accountService.get_account_by_email(accountname)){
                modelAndView.addObject("registerError","该邮箱已注册");
                modelAndView.setViewName("Account/Hoole_registerError");
                return modelAndView;
            }
        }else{
        //手机号
            account.setPersonPhone(accountname);
            if(null != accountService.get_account_by_phone(accountname)){
                modelAndView.addObject("registerError","该手机已注册");
                modelAndView.setViewName("Account/Hoole_registerError");
                return modelAndView;
            }
        }

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = format.parse(birthday + " 00:00:00");
        account.setPersonBirthday(date);
        int day = Integer.valueOf(birthday.substring(4,5));
        int month = Integer.valueOf(birthday.substring(1,2));
        account.setPersonConstellation(Constellation.getConstellation(month,day));
        account.setPersonSex(sex);
        accountService.add_account(account);
        //设置响应的jsp视图
        modelAndView.addObject("loginError","注册成功，欢迎拥抱Hoole");
        modelAndView.setViewName("Account/Hoole_loginError");

        return modelAndView;
    }

    /**
     * 个人资料
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_account_profile")
    public ModelAndView accountProfile()throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Account/Hoole_profile");
        return modelAndView;

    }

    /**
     * 用户修改
     * @param account
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_modify", method = RequestMethod.POST)
    public ModelAndView accountModify(HooleAccountT account, HttpSession session)throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        HooleAccountT currentAccount = (HooleAccountT) session.getAttribute("account");
        account.setPersonId(currentAccount.getPersonId());
        account.setPersonConstellation(Constellation.getConstellation(account.getPersonBirthday().getMonth()+1,account.getPersonBirthday().getDate()));
        accountService.modify_account(account);
        account = accountService.get_account_by_id(account.getPersonId());
        session.setAttribute("account",account);

        modelAndView.setViewName("Account/Hoole_profile");
        return modelAndView;
    }

}
