package com.CDogs.Hoole.mapper;

import com.CDogs.Hoole.pojo.RelationType;
import com.CDogs.Hoole.pojo.RelationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationTypeMapper {
    int countByExample(RelationTypeExample example);

    int deleteByExample(RelationTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RelationType record);

    int insertSelective(RelationType record);

    List<RelationType> selectByExample(RelationTypeExample example);

    RelationType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RelationType record, @Param("example") RelationTypeExample example);

    int updateByExample(@Param("record") RelationType record, @Param("example") RelationTypeExample example);

    int updateByPrimaryKeySelective(RelationType record);

    int updateByPrimaryKey(RelationType record);
}