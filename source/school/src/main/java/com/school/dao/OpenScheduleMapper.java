package com.school.dao;

import com.school.entity.OpenSchedule;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenScheduleMapper {
    long countByExample(OpenScheduleExample example);

    int deleteByExample(OpenScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenSchedule record);

    int insertSelective(OpenSchedule record);

    List<OpenSchedule> selectByExample(OpenScheduleExample example);

    OpenSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenSchedule record, @Param("example") OpenScheduleExample example);

    int updateByExample(@Param("record") OpenSchedule record, @Param("example") OpenScheduleExample example);

    int updateByPrimaryKeySelective(OpenSchedule record);

    int updateByPrimaryKey(OpenSchedule record);
}