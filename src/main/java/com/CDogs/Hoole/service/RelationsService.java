package com.CDogs.Hoole.service;

import com.CDogs.Hoole.Util.ServiceModel;
import com.CDogs.Hoole.pojo.Account;
import com.CDogs.Hoole.pojo.RelationType;
import com.CDogs.Hoole.pojo.Relations;

/**
 * Created by CDogs on 2016/7/4.
 */
public interface RelationsService {
    /**
     * 添加关系
     * @param relations
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel add_relations(Relations relations) throws Exception;

    /**
     * 查询用户所有关系
     * @param account
     * @return ServiceModel
     * @throws Exception
     */
    ServiceModel get_all_relations_by_account(Account account) throws Exception;

    /**
     * 查询关系群
     * @param relationType
     * @return
     * @throws Exception
     */
    ServiceModel get_relations_by_type(RelationType relationType) throws Exception;

    /**
     * 修改关系
     * @param relations
     * @return
     * @throws Exception
     */
    ServiceModel modify_relations(Relations relations) throws Exception;

    /**
     * 移除关系
     * @param relations
     * @return
     * @throws Exception
     */
    ServiceModel remove_relations(Relations relations) throws Exception;


}
