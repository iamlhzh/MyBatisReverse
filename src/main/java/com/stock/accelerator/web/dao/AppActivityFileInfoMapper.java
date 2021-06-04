package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityFileInfo;
import com.stock.accelerator.web.entity.AppActivityFileInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityFileInfoMapper {
    long countByExample(AppActivityFileInfoExample example);

    int deleteByExample(AppActivityFileInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityFileInfo record);

    int insertSelective(AppActivityFileInfo record);

    List<AppActivityFileInfo> selectByExampleWithRowbounds(AppActivityFileInfoExample example, RowBounds rowBounds);

    List<AppActivityFileInfo> selectByExample(AppActivityFileInfoExample example);

    AppActivityFileInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityFileInfo record, @Param("example") AppActivityFileInfoExample example);

    int updateByExample(@Param("record") AppActivityFileInfo record, @Param("example") AppActivityFileInfoExample example);

    int updateByPrimaryKeySelective(AppActivityFileInfo record);

    int updateByPrimaryKey(AppActivityFileInfo record);
}