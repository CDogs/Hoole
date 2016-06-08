package com.CDogs.Hoole.service;

import com.CDogs.Hoole.mapper.HooleAccountTMapper;
import com.CDogs.Hoole.pojo.HooleAccountT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
@Service
public class AccountServiceImpl implements AccountService {

    //mapper接口注入
    @Autowired
    private HooleAccountTMapper accountTMapper;

    public List<HooleAccountT> get_all_accounts() throws Exception {

        addAccounts();
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<HooleAccountT> accounts = accountTMapper.selectByExample(null);
        return accounts;
    }

    public void add_account(HooleAccountT account) throws Exception {
        //调用mapper类中的insert方法，如果传入类型为HooleAccountT
        accountTMapper.insert(account);
    }

    public void addAccounts(){
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
    }
}
