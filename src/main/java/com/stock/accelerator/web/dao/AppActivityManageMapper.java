package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityManage;
import com.stock.accelerator.web.entity.AppActivityManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityManageMapper {
    long countByExample(AppActivityManageExample example);

    int deleteByExample(AppActivityManageExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityManage record);

    int insertSelective(AppActivityManage record);

    List<AppActivityManage> selectByExampleWithRowbounds(AppActivityManageExample example, RowBounds rowBounds);

    List<AppActivityManage> selectByExample(AppActivityManageExample example);

    AppActivityManage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityManage record, @Param("example") AppActivityManageExample example);

    int updateByExample(@Param("record") AppActivityManage record, @Param("example") AppActivityManageExample example);

    int updateByPrimaryKeySelective(AppActivityManage record);

    int updateByPrimaryKey(AppActivityManage record);
}