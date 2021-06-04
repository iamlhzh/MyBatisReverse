package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityInteractAnswer;
import com.stock.accelerator.web.entity.AppActivityInteractAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityInteractAnswerMapper {
    long countByExample(AppActivityInteractAnswerExample example);

    int deleteByExample(AppActivityInteractAnswerExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityInteractAnswer record);

    int insertSelective(AppActivityInteractAnswer record);

    List<AppActivityInteractAnswer> selectByExampleWithBLOBsWithRowbounds(AppActivityInteractAnswerExample example, RowBounds rowBounds);

    List<AppActivityInteractAnswer> selectByExampleWithBLOBs(AppActivityInteractAnswerExample example);

    List<AppActivityInteractAnswer> selectByExampleWithRowbounds(AppActivityInteractAnswerExample example, RowBounds rowBounds);

    List<AppActivityInteractAnswer> selectByExample(AppActivityInteractAnswerExample example);

    AppActivityInteractAnswer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityInteractAnswer record, @Param("example") AppActivityInteractAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") AppActivityInteractAnswer record, @Param("example") AppActivityInteractAnswerExample example);

    int updateByExample(@Param("record") AppActivityInteractAnswer record, @Param("example") AppActivityInteractAnswerExample example);

    int updateByPrimaryKeySelective(AppActivityInteractAnswer record);

    int updateByPrimaryKeyWithBLOBs(AppActivityInteractAnswer record);

    int updateByPrimaryKey(AppActivityInteractAnswer record);
}