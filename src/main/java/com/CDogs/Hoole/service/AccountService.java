package com.CDogs.Hoole.service;

import com.CDogs.Hoole.Util.ServiceModel;
import com.CDogs.Hoole.pojo.Account;

import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
public interface AccountService {
    /**
     * 按id查找用户
     * @param id
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_account_by_id(long id) throws Exception;
    /**
     * 查找所有用户
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_all_accounts()throws Exception;
    /**
     * 添加用户
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel add_account(Account account) throws Exception;
    /**
     * 按绑定的邮箱或手机号 和 密码 查找用户
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_account_by_emailOrphoneAndpwd(String accountname, String password) throws Exception;

    /**
     * 按绑定的邮箱查找用户
     * @param email
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_account_by_email(String email) throws Exception;

    /**
     * 按绑定的手机号查找用户
     * @param phone
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_account_by_phone(String phone) throws Exception;

    /**
     * 修改个人信息
     * @param account
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel modify_account(Account account) throws Exception;
}
