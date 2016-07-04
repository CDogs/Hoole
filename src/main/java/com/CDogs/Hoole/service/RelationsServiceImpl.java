package com.CDogs.Hoole.service;

import com.CDogs.Hoole.Util.ServiceModel;
import com.CDogs.Hoole.mapper.RelationsMapper;
import com.CDogs.Hoole.pojo.Account;
import com.CDogs.Hoole.pojo.RelationType;
import com.CDogs.Hoole.pojo.Relations;
import com.CDogs.Hoole.pojo.RelationsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CDogs on 2016/7/4.
 */
@Service
public class RelationsServiceImpl implements RelationsService {

    @Autowired
    private RelationsMapper relationsMapper;

    public ServiceModel add_relations(Relations relations) throws Exception {
        ServiceModel model = new ServiceModel("添加失败",-1,false);
        RelationsExample example = new RelationsExample();
        example.or().andAccountidEqualTo(relations.getAccountid()).andContactidEqualTo(relations.getContactid());
        Relations existRelation = (Relations) relationsMapper.selectByExample(example);
        if(existRelation != null){
            model.setCode(0);
            model.setMsg("你们已经是好友了");
        }else{
            relationsMapper.insert(relations);
            model.setMsg("添加成功");
            model.setCode(1);
            model.setIsSuccess(true);
        }
        return model;
    }

    public ServiceModel get_all_relations_by_account(Account account) throws Exception {
        ServiceModel model = new ServiceModel("查询失败",-1,false);
        List<Relations> relationses = relationsMapper.selectByExample(null);
        if(relationses == null || relationses.size()<=0){
            model.setCode(0);
            model.setMsg("你还没有好友，去添加好友吧，Hoole希望你开心");
        }else{
            model.setCode(1);
            model.setMsg("查询成功");
            model.setIsSuccess(true);
            model.setData(relationses);
        }
        return model;
    }

    public ServiceModel get_relations_by_type(RelationType relationType) throws Exception {
        ServiceModel model = new ServiceModel("查询失败",-1,false);
        RelationsExample example = new RelationsExample();
        example.or().andRelationEqualTo(relationType.getId());
        List<Relations> relationses = relationsMapper.selectByExample(example);
        if(relationses == null || relationses.size()<=0){
            model.setCode(0);
            model.setMsg("你还没有该关系好友，去添加好友吧，Hoole希望你开心");
        }else{
            model.setCode(1);
            model.setMsg("查询成功");
            model.setIsSuccess(true);
            model.setData(relationses);
        }
        return model;
    }

    public ServiceModel modify_relations(Relations relations) throws Exception {
        ServiceModel model = new ServiceModel("修改失败",-1,false);
        Relations existRelations = relationsMapper.selectByPrimaryKey(relations.getId());
        if(null == existRelations){
            model.setCode(0);
            model.setMsg("你们还不是好友，请添加哟");
        }else{
            relationsMapper.updateByPrimaryKeySelective(relations);
            model.setCode(1);
            model.setMsg("修改成功");
            model.setIsSuccess(true);
        }
        return model;
    }

    public ServiceModel remove_relations(Relations relations) throws Exception {
        ServiceModel model = new ServiceModel("绝交失败",-1,false);
        Relations existRelations = relationsMapper.selectByPrimaryKey(relations.getId());
        if(null == existRelations){
            model.setCode(0);
            model.setMsg("你们还不是好友，请添加哟");
        }else{
            relationsMapper.deleteByPrimaryKey(relations.getId());
            model.setCode(1);
            model.setMsg("你们已经不是好友了");
            model.setIsSuccess(true);
        }
        return model;
    }
}
