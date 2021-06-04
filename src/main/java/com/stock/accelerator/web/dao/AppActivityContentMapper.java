package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityContent;
import com.stock.accelerator.web.entity.AppActivityContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityContentMapper {
    long countByExample(AppActivityContentExample example);

    int deleteByExample(AppActivityContentExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityContent record);

    int insertSelective(AppActivityContent record);

    List<AppActivityContent> selectByExampleWithBLOBsWithRowbounds(AppActivityContentExample example, RowBounds rowBounds);

    List<AppActivityContent> selectByExampleWithBLOBs(AppActivityContentExample example);

    List<AppActivityContent> selectByExampleWithRowbounds(AppActivityContentExample example, RowBounds rowBounds);

    List<AppActivityContent> selectByExample(AppActivityContentExample example);

    AppActivityContent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityContent record, @Param("example") AppActivityContentExample example);

    int updateByExampleWithBLOBs(@Param("record") AppActivityContent record, @Param("example") AppActivityContentExample example);

    int updateByExample(@Param("record") AppActivityContent record, @Param("example") AppActivityContentExample example);

    int updateByPrimaryKeySelective(AppActivityContent record);

    int updateByPrimaryKeyWithBLOBs(AppActivityContent record);

    int updateByPrimaryKey(AppActivityContent record);
}