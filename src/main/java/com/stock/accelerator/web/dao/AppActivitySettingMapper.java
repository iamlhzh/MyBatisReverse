package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivitySetting;
import com.stock.accelerator.web.entity.AppActivitySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivitySettingMapper {
    long countByExample(AppActivitySettingExample example);

    int deleteByExample(AppActivitySettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivitySetting record);

    int insertSelective(AppActivitySetting record);

    List<AppActivitySetting> selectByExampleWithRowbounds(AppActivitySettingExample example, RowBounds rowBounds);

    List<AppActivitySetting> selectByExample(AppActivitySettingExample example);

    AppActivitySetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivitySetting record, @Param("example") AppActivitySettingExample example);

    int updateByExample(@Param("record") AppActivitySetting record, @Param("example") AppActivitySettingExample example);

    int updateByPrimaryKeySelective(AppActivitySetting record);

    int updateByPrimaryKey(AppActivitySetting record);
}