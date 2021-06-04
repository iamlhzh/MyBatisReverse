package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityAttendPerson;
import com.stock.accelerator.web.entity.AppActivityAttendPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityAttendPersonMapper {
    long countByExample(AppActivityAttendPersonExample example);

    int deleteByExample(AppActivityAttendPersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityAttendPerson record);

    int insertSelective(AppActivityAttendPerson record);

    List<AppActivityAttendPerson> selectByExampleWithRowbounds(AppActivityAttendPersonExample example, RowBounds rowBounds);

    List<AppActivityAttendPerson> selectByExample(AppActivityAttendPersonExample example);

    AppActivityAttendPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityAttendPerson record, @Param("example") AppActivityAttendPersonExample example);

    int updateByExample(@Param("record") AppActivityAttendPerson record, @Param("example") AppActivityAttendPersonExample example);

    int updateByPrimaryKeySelective(AppActivityAttendPerson record);

    int updateByPrimaryKey(AppActivityAttendPerson record);
}