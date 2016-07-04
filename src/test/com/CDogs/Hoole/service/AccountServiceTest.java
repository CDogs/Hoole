package com.CDogs.Hoole.service;

import com.CDogs.Hoole.Util.Constellation;
import com.CDogs.Hoole.pojo.Account;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * Created by CDogs on 2016/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring/applicationContext.xml")
public class AccountServiceTest extends TestCase {

    @Autowired
    private AccountService accountService;


    @Before
    public void setUp() throws Exception {

       // accountService = new AccountServiceImpl();
    }

    @Test
    public void testAdd_account() throws Exception {
        System.out.println(accountService);
        for (int i = 1; i <= 10; ++i) {
            Account account = new Account();
            System.out.println(i);
            account.setAccountNum(UUID.randomUUID().toString());
            if(i%2==0){
                account.setGender("男");
            } else {
                account.setGender("女");
            }
            account.setBindPhone("152" + i * 3 + "00");
            account.setBirthday(new Date());
            account.setAddress("武汉市");
            account.setLastLoginTime(new Date());
            account.setCreateTime(new Date());
            account.setPassword("123123");
            account.setNickname("Hoole" + i);
            account.setConstellation(Constellation.getConstellation(new Date()));
            account.setCompany("Hoole");
            account.setGrade(0);
            account.setSignature("我在Hoole，快乐无限！");
            account.setState("在线");
            account.setPostcode("2019756");
            accountService.add_account(account);



            System.out.println(account.getAccountNum());

        }
    }
}