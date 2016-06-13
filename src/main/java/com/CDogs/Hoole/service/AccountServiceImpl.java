package com.CDogs.Hoole.service;

import com.CDogs.Hoole.mapper.HooleAccountTMapper;
import com.CDogs.Hoole.pojo.HooleAccountT;
import com.CDogs.Hoole.pojo.HooleAccountTExample;
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
    private HooleAccountTMapper accountTMapper;

    /**
     * 按id号查询
     * @param id
     * @return
     * @throws Exception
     */
    public HooleAccountT get_account_by_id(int id) throws Exception {
        return accountTMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    public List<HooleAccountT> get_all_accounts() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<HooleAccountT> accounts = accountTMapper.selectByExample(null);
        return accounts;
    }

    /**
     * 添加用户
     * @param account
     * @throws Exception
     */
    public void add_account(HooleAccountT account) throws Exception {
        account.setPersonCreateTime(new Date(System.currentTimeMillis()));
        account.setPersonAge(Short.valueOf("25"));
        account.setPersonGrade(0);
        account.setPersonIntegration(0);
        account.setPersonNickname("hoole" + Math.round(Math.random() * 10000));
        account.setPersonLastTime(new Date(System.currentTimeMillis()));
        account.setPersonState("在线");
        account.setPersonSignature("Hello to Hoole");
        account.setPersonAccountNum(UUID.randomUUID().toString().substring(0, 13));
        //调用mapper类中的insert方法，如果传入类型为HooleAccountT
        accountTMapper.insert(account);
    }

    /**
     * 按邮箱或手机号 和 密码查找用户
     * @param accountname
     * @param password
     * @return
     * @throws Exception
     */
    public HooleAccountT get_account_by_emailOrphoneAndpwd(String accountname, String password) throws Exception {

        HooleAccountTExample example = new HooleAccountTExample();
        example.setDistinct(true);
        if(accountname.matches("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?")){
            example.or().andPersonEmailEqualTo(accountname).andPersonPasswordEqualTo(password);
        }else{
            //手机号
            example.or().andPersonPhoneEqualTo(accountname).andPersonPasswordEqualTo(password);
        }

        List<HooleAccountT> accounts = accountTMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        //更新上次登录时间
        HooleAccountT account = accounts.get(0);
        account.setPersonLastTime(new Date());
        accountTMapper.updateByPrimaryKey(account);


        return accounts.get(0);
    }

    /**
     * 按邮箱 查找用户
     * @param email
     * @return
     * @throws Exception
     */
    public HooleAccountT get_account_by_email(String email) throws Exception {

        HooleAccountTExample example = new HooleAccountTExample();
        example.setDistinct(true);
        example.or().andPersonEmailEqualTo(email);
        List<HooleAccountT> accounts = accountTMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        return accounts.get(0);
    }

    /**
     * 按手机号 查找用户
     * @param phone
     * @return
     * @throws Exception
     */
    public HooleAccountT get_account_by_phone(String phone) throws Exception {

        HooleAccountTExample example = new HooleAccountTExample();
        example.setDistinct(true);
        example.or().andPersonPhoneEqualTo(phone);
        List<HooleAccountT> accounts = accountTMapper.selectByExample(example);

        if(accounts.size()<=0)return null;

        return accounts.get(0);
    }

    /**
     * 修改个人信息
     * @param account
     * @throws Exception
     */
    public void modify_account(HooleAccountT account) throws Exception {

        accountTMapper.updateByPrimaryKeySelective(account);

    }

    //添加批量用户用于测试
/*    public void addAccounts(){
        HooleAccountT account = new HooleAccountT();
        for(int i=205; i<1000;++i){
            account.setPersonCreateTime(new Date(System.currentTimeMillis()));
            account.setPersonAddress(i + "官洲");
            account.setPersonAge(Short.valueOf("12"));
            account.setPersonBirthdate(new Date(System.currentTimeMillis()));
            account.setPersonCompany("Hoole");
            account.setPersonEmail((Math.random() * 10000) / 10 + "@hoole.com");
            account.setPersonGrade(i);
            account.setPersonIntegration(i);
            account.setPersonNickname("hoole" + i);
            account.setPersonLastTime(new Date(System.currentTimeMillis()));
            account.setPersonConstellation("巨蟹座");
            account.setPersonPhone((Math.random() * 10000) / 10 + "2");
            account.setPersonPortrait("hoole");
            account.setPersonPostcode("123456");
            account.setPersonSchool("武汉理工大学");
            account.setPersonSex("女");
            account.setPersonSignature("123");
            account.setPersonState("在线");
            try {
                add_account(account);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
}
