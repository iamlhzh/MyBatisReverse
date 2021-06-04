package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityMeetingAgenda;
import com.stock.accelerator.web.entity.AppActivityMeetingAgendaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityMeetingAgendaMapper {
    long countByExample(AppActivityMeetingAgendaExample example);

    int deleteByExample(AppActivityMeetingAgendaExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityMeetingAgenda record);

    int insertSelective(AppActivityMeetingAgenda record);

    List<AppActivityMeetingAgenda> selectByExampleWithRowbounds(AppActivityMeetingAgendaExample example, RowBounds rowBounds);

    List<AppActivityMeetingAgenda> selectByExample(AppActivityMeetingAgendaExample example);

    AppActivityMeetingAgenda selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityMeetingAgenda record, @Param("example") AppActivityMeetingAgendaExample example);

    int updateByExample(@Param("record") AppActivityMeetingAgenda record, @Param("example") AppActivityMeetingAgendaExample example);

    int updateByPrimaryKeySelective(AppActivityMeetingAgenda record);

    int updateByPrimaryKey(AppActivityMeetingAgenda record);
}