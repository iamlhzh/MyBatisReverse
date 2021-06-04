package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityNoticeLog;
import com.stock.accelerator.web.entity.AppActivityNoticeLogExample;
import com.stock.accelerator.web.entity.AppActivityNoticeLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityNoticeLogMapper {
    long countByExample(AppActivityNoticeLogExample example);

    int deleteByExample(AppActivityNoticeLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityNoticeLogWithBLOBs record);

    int insertSelective(AppActivityNoticeLogWithBLOBs record);

    List<AppActivityNoticeLogWithBLOBs> selectByExampleWithBLOBsWithRowbounds(AppActivityNoticeLogExample example, RowBounds rowBounds);

    List<AppActivityNoticeLogWithBLOBs> selectByExampleWithBLOBs(AppActivityNoticeLogExample example);

    List<AppActivityNoticeLog> selectByExampleWithRowbounds(AppActivityNoticeLogExample example, RowBounds rowBounds);

    List<AppActivityNoticeLog> selectByExample(AppActivityNoticeLogExample example);

    AppActivityNoticeLogWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityNoticeLogWithBLOBs record, @Param("example") AppActivityNoticeLogExample example);

    int updateByExampleWithBLOBs(@Param("record") AppActivityNoticeLogWithBLOBs record, @Param("example") AppActivityNoticeLogExample example);

    int updateByExample(@Param("record") AppActivityNoticeLog record, @Param("example") AppActivityNoticeLogExample example);

    int updateByPrimaryKeySelective(AppActivityNoticeLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AppActivityNoticeLogWithBLOBs record);

    int updateByPrimaryKey(AppActivityNoticeLog record);
}