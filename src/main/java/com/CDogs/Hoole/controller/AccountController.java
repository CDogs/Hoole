package com.CDogs.Hoole.controller;

import com.CDogs.Hoole.Util.Constellation;
import com.CDogs.Hoole.Util.FileUtils;
import com.CDogs.Hoole.Util.JacksonUtils;
import com.CDogs.Hoole.Util.ServiceModel;
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
import java.util.Date;

/**
 * 用户登录注册修改信息控制器
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
    @ResponseBody
    public String getAllAccounts()throws Exception{

        //调用service方法得到用户列表
        ServiceModel model = accountService.get_all_accounts();

        return JacksonUtils.toJSon(model);
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
        ServiceModel model = new ServiceModel("登录失败,请检查账号和密码",-1,false);
        if(accountname == null || accountname.trim().equals("") || password == null || password.trim().equals(""))return JacksonUtils.toJSon(model);

        //查找匹配的account
        model = accountService.get_account_by_emailOrphoneAndpwd(accountname, password);

        if(-1 == model.getCode()){
            //异步返回信息
            model.setCode(0);
            model.setMsg("账号或密码错误，请重新登录");

            return JacksonUtils.toJSon(model);
        }
            //将用户添加到session中
        session.setAttribute("account", model.getData());
        return JacksonUtils.toJSon(model);
    }

    /**
     * 用户注册(异步)
     * @param accountname
     * @param password
     * @param birthday
     * @param gender
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/Hoole_account_register", method = RequestMethod.POST)
    @ResponseBody
    public String accountRegister(String accountname, String password, Date birthday, String gender)throws Exception{
        System.out.println("accountRegister...");
        ServiceModel model = new ServiceModel("注册失败，请重新注册",-1,false);
        if(accountname.trim().equals("")||accountname == null || password == null || password.trim().equals("")||birthday == null)return JacksonUtils.toJSon(model);
        System.out.println(birthday);
        Account account = new Account();
        account.setPassword(password);
        //邮箱
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            account.setEmail(accountname);
            account.setBindEmail(accountname);
            if(accountService.get_account_by_email(accountname).isSuccess()){
                model.setMsg("邮箱已经注册");
                model.setCode(0);
                return JacksonUtils.toJSon(model);
            }
        }else{
        //手机号
            account.setPhone(accountname);
            account.setBindPhone(accountname);
            if(accountService.get_account_by_phone(accountname).isSuccess()){
                model.setCode(0);
                model.setMsg("该手机已经注册");
                return JacksonUtils.toJSon(model);
            }
        }

        account.setBirthday(birthday);
        account.setConstellation(Constellation.getConstellation(birthday));
        account.setGender(gender);
        model = accountService.add_account(account);

        return JacksonUtils.toJSon(model);
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
     * 账户设置
     * @return
     * @throws Exception
     */
    @RequestMapping("/Hoole_account_setting")
    public ModelAndView accountSetting()throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Account/Hoole_account_setting");
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

        account.setConstellation(Constellation.getConstellation(account.getBirthday()));
        accountService.modify_account(account);

        ServiceModel model = accountService.get_account_by_id(account.getId());

        session.setAttribute("account", model.getData());
        modelAndView.addObject("account", model.getData());


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

        portraitPath = "AccountFile" + portraitPath;
        System.out.println(portraitPath);

        currentAccount.setPortrait(portraitPath);

        accountService.modify_account(currentAccount);

        currentAccount = (Account) accountService.get_account_by_id(currentAccount.getId()).getData();

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

    /**
     * 测试
     */
    @RequestMapping("/Hoole_accounts")
    public String goToAccounts(){
        return "accounts";
    }
}
