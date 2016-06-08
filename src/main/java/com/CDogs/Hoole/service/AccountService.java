package com.CDogs.Hoole.service;

import com.CDogs.Hoole.pojo.HooleAccountT;

import java.util.List;

/**
 * Created by CDogs on 2016/6/8.
 */
public interface AccountService {
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
}
