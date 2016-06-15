package com.CDogs.Hoole.controller;

import com.CDogs.Hoole.Util.Constellation;
import com.CDogs.Hoole.Util.FileUtils;
import com.CDogs.Hoole.pojo.Account;
import com.CDogs.Hoole.service.AccountService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
        List<Account> accounts = accountService.get_all_accounts();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("accounts",accounts);
        //设置响应的jsp视图
        modelAndView.setViewName("accounts");

        return modelAndView;
    }

    /**
     * 用户登录(异步）
     * @param accountname
     * @param password
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_login", method = RequestMethod.POST)
    @ResponseBody
    public String accountLogin(String accountname, String password,HttpSession session)throws Exception{

        System.out.println("accountLogin...");

        //查找匹配的account
        Account account = accountService.get_account_by_emailOrphoneAndpwd(accountname, password);

        if(null == account){
            //异步返回信息
            return "loginError";
        }
            //将用户添加到session中
        session.setAttribute("account", account);

        return "loginSuccess";
    }

    /**
     * 用户注册(异步)
     * @param accountname
     * @param password
     * @param birthday
     * @param sex
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_register", method = RequestMethod.POST)
    @ResponseBody
    public String accountRegister(String accountname, String password, String birthday, String sex)throws Exception{
        System.out.println("accountRegister...");
        Account account = new Account();
        account.setPassword(password);
        //邮箱
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            account.setEmail(accountname);
            if(null != accountService.get_account_by_email(accountname)){
                return "errorEmail";
            }
        }else{
        //手机号
            account.setPhone(accountname);
            if(null != accountService.get_account_by_phone(accountname)){
                return "errorPhone";
            }
        }

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = format.parse(birthday + " 00:00:00");
        account.setBirthday(date);
        int day = Integer.valueOf(birthday.substring(4,5));
        int month = Integer.valueOf(birthday.substring(1, 2));
        account.setConstellation(Constellation.getConstellation(month, day));
        account.setSex(sex);
        accountService.add_account(account);
        //设置响应的jsp视图

        return "registerSuccess";
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
    public ModelAndView accountModify(Account account, HttpSession session)throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        Account currentAccount = (Account) session.getAttribute("account");
        account.setId(currentAccount.getId());

        account.setConstellation(Constellation.getConstellation(account.getBirthday().getMonth() + 1, account.getBirthday().getDate()));
        accountService.modify_account(account);

        account = accountService.get_account_by_id(account.getId());

        session.setAttribute("account", account);
        modelAndView.addObject("account", account);


        modelAndView.setViewName("Account/Hoole_profile");
        return modelAndView;
    }

    /**
     * 异步需要用到@ResponseBody
     * 头像上传
     * @param portraitUpload
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_portrait_upload", method = RequestMethod.POST)
    @ResponseBody
    public String accountPortraitUpload(MultipartFile portraitUpload, HttpSession session)throws Exception {


        System.out.println("开始异步上传。。。。");

        //记录上传过程起始时的时间，用来计算上传时间
        int pre = (int) System.currentTimeMillis();
        if( null == portraitUpload || portraitUpload.isEmpty()){
            return "error";
        }


        Account currentAccount = (Account) session.getAttribute("account");
        System.out.println(session.getServletContext().getContextPath());
        String basePath = session.getServletContext().getRealPath("/AccountFile") + "/" + currentAccount.getId() + "/portrait/";
        String portraitPath = FileUtils.saveMultipartFileRelative(portraitUpload, basePath);

        //记录上传该文件后的时间
        int finaltime = (int) System.currentTimeMillis();
        System.out.println(finaltime - pre);

        portraitPath = "/AccountFile" + portraitPath;
        System.out.println(portraitPath);

        currentAccount.setPortrait(portraitPath);

        accountService.modify_account(currentAccount);

        currentAccount = accountService.get_account_by_id(currentAccount.getId());

        session.setAttribute("account", currentAccount);


        return portraitPath;
    }


    /**
     * 跳转到主页
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_index")
    public ModelAndView goToHooleIndex(HttpSession session) throws Exception {
        System.out.println("goToHooleIndex...");
        ModelAndView modelAndView = new ModelAndView();

        Account account = (Account) session.getAttribute("account");
        if(null == account){
            //没登陆
            modelAndView.setViewName("redirect:/Hoole_loginUI");
        }else {
            //登录跳转
            modelAndView.setViewName("Account/Hoole_index");
        }

        return modelAndView;
    }

    /**
     * 退出
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_account_logout")
    public ModelAndView accountLogout(HttpSession session) throws  Exception {
        System.out.println("accountLogout..");
        ModelAndView modelAndView = new ModelAndView();

        session.removeAttribute("account");

        modelAndView.setViewName("redirect:/Hoole_loginUI");

        return modelAndView;
    }

    /**
     * 跳转到loginUI
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_loginUI")
    public String goToLoginUI() throws Exception{
        return "Hoole_loginUI";
    }

}
