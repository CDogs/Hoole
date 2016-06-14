package com.CDogs.Hoole.service;

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
     * @return
     * @throws Exception
     */
    public Account get_account_by_id(int id) throws Exception {
        return accountMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    public List<Account> get_all_accounts() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<Account> accounts = accountMapper.selectByExample(null);
        return accounts;
    }

    /**
     * 添加用户
     * @param account
     * @throws Exception
     */
    public void add_account(Account account) throws Exception {
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
    }

    /**
     * 按邮箱或手机号 和 密码查找用户
     * @param accountname
     * @param password
     * @return
     * @throws Exception
     */
    public Account get_account_by_emailOrphoneAndpwd(String accountname, String password) throws Exception {

        AccountExample example = new AccountExample();
        example.setDistinct(true);
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            example.or().andEmailEqualTo(accountname).andPasswordEqualTo(password);
        }else{
            //手机号
            example.or().andPhoneEqualTo(accountname).andPasswordEqualTo(password);
        }

        List<Account> accounts = accountMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        //更新上次登录时间
        Account account = accounts.get(0);
        account.setLastLoginTime(new Date());
        accountMapper.updateByPrimaryKey(account);


        return accounts.get(0);
    }

    /**
     * 按邮箱 查找用户
     * @param email
     * @return
     * @throws Exception
     */
    public Account get_account_by_email(String email) throws Exception {

        AccountExample example = new AccountExample();
        example.setDistinct(true);
        example.or().andEmailEqualTo(email);
        List<Account> accounts = accountMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        return accounts.get(0);
    }

    /**
     * 按手机号 查找用户
     * @param phone
     * @return
     * @throws Exception
     */
    public Account get_account_by_phone(String phone) throws Exception {

        AccountExample example = new AccountExample();
        example.setDistinct(true);
        example.or().andPhoneEqualTo(phone);
        List<Account> accounts = accountMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        return accounts.get(0);
    }

    /**
     * 修改个人信息
     * @param account
     * @throws Exception
     */
    public void modify_account(Account account) throws Exception {

        accountMapper.updateByPrimaryKeySelective(account);

    }

    //添加批量用户用于测试
/*    public void addAccounts(){
        Account account = new Account();
        for(int i=205; i<1000;++i){
            account.setCreateTime(new Date(System.currentTimeMillis()));
            account.setAddress(i + "官洲");
            account.setAge(Short.valueOf("12"));
            account.setBirthday(new Date(System.currentTimeMillis()));
            account.setCompany("Hoole");
            account.setEmail((Math.random() * 10000) / 10 + "@hoole.com");
            account.setGrade(i);
            account.setIntegration(i);
            account.setNickname("hoole" + i);
            account.setLastTime(new Date(System.currentTimeMillis()));
            account.setConstellation("巨蟹座");
            account.setPhone((Math.random() * 10000) / 10 + "2");
            account.setPortrait("hoole");
            account.setPostcode("123456");
            account.setSchool("武汉理工大学");
            account.setSex("女");
            account.setSignature("123");
            account.setState("在线");
            try {
                add_account(account);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
}
