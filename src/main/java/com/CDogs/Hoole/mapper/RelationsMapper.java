package com.CDogs.Hoole.mapper;

import com.CDogs.Hoole.pojo.Relations;
import com.CDogs.Hoole.pojo.RelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationsMapper {
    int countByExample(RelationsExample example);

    int deleteByExample(RelationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Relations record);

    int insertSelective(Relations record);

    List<Relations> selectByExample(RelationsExample example);

    Relations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Relations record, @Param("example") RelationsExample example);

    int updateByExample(@Param("record") Relations record, @Param("example") RelationsExample example);

    int updateByPrimaryKeySelective(Relations record);

    int updateByPrimaryKey(Relations record);
}