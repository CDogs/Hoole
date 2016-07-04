package com.CDogs.Hoole.service;

import com.CDogs.Hoole.Util.ServiceModel;
import com.CDogs.Hoole.mapper.AccountMapper;
import com.CDogs.Hoole.pojo.Account;
import com.CDogs.Hoole.pojo.AccountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by CDogs on 2016/6/8.
 */
@Service
public class AccountServiceImpl implements AccountService {

    //mapper接口注入
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 按id号查询
     * @param id
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel get_account_by_id(long id) throws Exception {
        ServiceModel model = new ServiceModel("查询失败",-1,false);
        Account account = accountMapper.selectByPrimaryKey(id);
        if(null == account){
            model.setMsg("无此账户");
            model.setCode(0);
        }else{
            model.setCode(1);
            model.setMsg("查询成功");
            model.setData(account);
            model.setIsSuccess(true);
        }
        return model;
    }

    /**
     * 查找所有用户
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel get_all_accounts() throws Exception {

        ServiceModel model = new ServiceModel("查询失败",-1,false);

        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<Account> accounts = accountMapper.selectByExample(null);
        if(null == accounts){
            model.setMsg("账户为空");
            model.setCode(0);
        }else{
            model.setCode(1);
            model.setMsg("查询成功");
            model.setData(accounts);
            model.setIsSuccess(true);
        }
        return model;
    }

    /**
     * 添加用户
     * @param account
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel add_account(Account account) throws Exception {
        account.setCreateTime(new Date(System.currentTimeMillis()));
        account.setGrade(0);
        account.setIntegration(0);
        account.setNickname("hoole" + Math.round(Math.random() * 10000));
        account.setLastLoginTime(new Date(System.currentTimeMillis()));
        account.setState("在线");
        account.setSignature("Hello to Hoole");
        account.setAccountNum(UUID.randomUUID().toString().substring(0, 13));
        //调用mapper类中的insert方法，如果传入类型为Account
        accountMapper.insert(account);
        return new ServiceModel("注册成功",1,true);
    }

    /**
     * 按绑定的邮箱或手机号 和 密码查找用户(登录时用，需要修改登录时间)
     * @param accountname
     * @param password
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel get_account_by_emailOrphoneAndpwd(String accountname, String password) throws Exception {

        ServiceModel model = new ServiceModel("无匹配用户",-1,false);
        AccountExample example = new AccountExample();
        example.setDistinct(true);
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            example.or().andBindEmailEqualTo(accountname).andPasswordEqualTo(password);
        }else{
            //手机号
            example.or().andBindPhoneEqualTo(accountname).andPasswordEqualTo(password);
        }

        List<Account> accounts = accountMapper.selectByExample(example);

        if(null == accounts  || accounts.size()<=0)return model;

        //更新上次登录时间
        Account account = accounts.get(0);
        account.setLastLoginTime(new Date());
        accountMapper.updateByPrimaryKey(account);

        model.setCode(1);
        model.setData(accounts.get(0));
        model.setIsSuccess(true);
        model.setMsg("登录成功");
        return model;
    }

    /**
     * 按绑定的邮箱 查找用户
     * @param email
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel get_account_by_email(String email) throws Exception {

        ServiceModel model = new ServiceModel("无匹配用户",-1,false);
        AccountExample example = new AccountExample();
        example.setDistinct(true);
        example.or().andBindEmailEqualTo(email);
        List<Account> accounts = accountMapper.selectByExample(example);

        if(null == accounts || accounts.size()<=0)return model;
        model.setCode(1);
        model.setMsg("查询成功");
        model.setData(accounts.get(0));
        model.setIsSuccess(true);

        return model;
    }

    /**
     * 按绑定的手机号 查找用户
     * @param phone
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel get_account_by_phone(String phone) throws Exception {

        ServiceModel model = new ServiceModel("无匹配用户",-1,false);
        AccountExample example = new AccountExample();
        example.setDistinct(true);
//        example.or().andPhoneEqualTo(phone);
        example.or().andBindPhoneEqualTo(phone);
        List<Account> accounts = accountMapper.selectByExample(example);

        if(null == accounts || accounts.size()<=0)return model;
        model.setCode(1);
        model.setMsg("查询成功");
        model.setData(accounts.get(0));
        model.setIsSuccess(true);

        return model;
    }

    /**
     * 修改个人信息
     * @param account
     * @return ServiceModel
     * @throws Exception
     */
    public ServiceModel modify_account(Account account) throws Exception {

        accountMapper.updateByPrimaryKeySelective(account);
        return new ServiceModel("修改成功",1,true);
    }


}
