package com.CDogs.Hoole.controller;

import com.CDogs.Hoole.service.RelationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户关系管理控制器
 * Created by CDogs on 2016/7/4.
 */
@Controller
public class RelationsController {

    @Autowired
    private RelationsService relationsService;

    /**
     * 返回好友关系
     * @return
     */
    @RequestMapping("Relations/getAllRelations")
    @ResponseBody
    public String getAllRelations(){

        return "";
    }

    /**
     * 加好友
     * @return
     */
    @RequestMapping("Relations/addRelations")
    @ResponseBody
    public String addRelations(){

        return "";
    }

    /**
     * 好友关系的移动
     * @return
     */
    @RequestMapping("Relations/modifyRelations")
    @ResponseBody
    public String modifyRelations(){

        return "";
    }

    /**
     * 删除好友
     * @return
     */
    @RequestMapping("Relations/removeRelations")
    @ResponseBody
    public String removeRelation(){

        return "";
    }


}
