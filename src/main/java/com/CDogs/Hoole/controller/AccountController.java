package com.CDogs.Hoole.controller;

import com.CDogs.Hoole.pojo.HooleAccountT;
import com.CDogs.Hoole.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    //注入Service类
    @Autowired
    private AccountService accountService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/get_all_accounts")
    public ModelAndView getAllAccounts()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        //调用service方法得到用户列表
        List<HooleAccountT> accounts = accountService.get_all_accounts();
        System.out.println(accounts.size());
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("accounts",accounts);
        //设置响应的jsp视图
        modelAndView.setViewName("accounts");

        return modelAndView;
    }




}
