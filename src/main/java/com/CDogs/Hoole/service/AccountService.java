package com.CDogs.Hoole.service;

import com.CDogs.Hoole.pojo.HooleAccountT;

import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
public interface AccountService {
    /**
     * 按id查找用户
     * @param id
     * @return
     * @throws Exception
     */
    HooleAccountT get_account_by_id(int id) throws Exception;
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<HooleAccountT> get_all_accounts()throws Exception;
    /**
     * 添加用户
     * @return
     * @throws Exception
     */
     void add_account(HooleAccountT account) throws Exception;
    /**
     * 按邮箱或手机号 和 密码 查找用户
     * @return
     * @throws Exception
     */
     HooleAccountT get_account_by_emailOrphoneAndpwd(String accountname, String password) throws Exception;

    /**
     * 按邮箱查找用户
     * @param email
     * @return
     * @throws Exception
     */
     HooleAccountT get_account_by_email(String email) throws Exception;

    /**
     * 按手机号查找用户
     * @param phone
     * @return
     * @throws Exception
     */
     HooleAccountT get_account_by_phone(String phone) throws Exception;

    /**
     * 修改个人信息
     * @param account
     * @throws Exception
     */
     void modify_account(HooleAccountT account) throws Exception;
}
