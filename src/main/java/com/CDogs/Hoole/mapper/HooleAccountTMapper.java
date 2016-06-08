package com.CDogs.Hoole.mapper;

import com.CDogs.Hoole.pojo.HooleAccountT;
import com.CDogs.Hoole.pojo.HooleAccountTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HooleAccountTMapper {
    int countByExample(HooleAccountTExample example);

    int deleteByExample(HooleAccountTExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(HooleAccountT record);

    int insertSelective(HooleAccountT record);

    List<HooleAccountT> selectByExample(HooleAccountTExample example);

    HooleAccountT selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") HooleAccountT record, @Param("example") HooleAccountTExample example);

    int updateByExample(@Param("record") HooleAccountT record, @Param("example") HooleAccountTExample example);

    int updateByPrimaryKeySelective(HooleAccountT record);

    int updateByPrimaryKey(HooleAccountT record);
}