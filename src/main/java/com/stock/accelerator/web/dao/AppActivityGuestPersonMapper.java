package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityGuestPerson;
import com.stock.accelerator.web.entity.AppActivityGuestPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityGuestPersonMapper {
    long countByExample(AppActivityGuestPersonExample example);

    int deleteByExample(AppActivityGuestPersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityGuestPerson record);

    int insertSelective(AppActivityGuestPerson record);

    List<AppActivityGuestPerson> selectByExampleWithRowbounds(AppActivityGuestPersonExample example, RowBounds rowBounds);

    List<AppActivityGuestPerson> selectByExample(AppActivityGuestPersonExample example);

    AppActivityGuestPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityGuestPerson record, @Param("example") AppActivityGuestPersonExample example);

    int updateByExample(@Param("record") AppActivityGuestPerson record, @Param("example") AppActivityGuestPersonExample example);

    int updateByPrimaryKeySelective(AppActivityGuestPerson record);

    int updateByPrimaryKey(AppActivityGuestPerson record);
}