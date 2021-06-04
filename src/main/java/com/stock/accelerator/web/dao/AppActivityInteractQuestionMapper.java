package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.AppActivityInteractQuestion;
import com.stock.accelerator.web.entity.AppActivityInteractQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppActivityInteractQuestionMapper {
    long countByExample(AppActivityInteractQuestionExample example);

    int deleteByExample(AppActivityInteractQuestionExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppActivityInteractQuestion record);

    int insertSelective(AppActivityInteractQuestion record);

    List<AppActivityInteractQuestion> selectByExampleWithBLOBsWithRowbounds(AppActivityInteractQuestionExample example, RowBounds rowBounds);

    List<AppActivityInteractQuestion> selectByExampleWithBLOBs(AppActivityInteractQuestionExample example);

    List<AppActivityInteractQuestion> selectByExampleWithRowbounds(AppActivityInteractQuestionExample example, RowBounds rowBounds);

    List<AppActivityInteractQuestion> selectByExample(AppActivityInteractQuestionExample example);

    AppActivityInteractQuestion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppActivityInteractQuestion record, @Param("example") AppActivityInteractQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") AppActivityInteractQuestion record, @Param("example") AppActivityInteractQuestionExample example);

    int updateByExample(@Param("record") AppActivityInteractQuestion record, @Param("example") AppActivityInteractQuestionExample example);

    int updateByPrimaryKeySelective(AppActivityInteractQuestion record);

    int updateByPrimaryKeyWithBLOBs(AppActivityInteractQuestion record);

    int updateByPrimaryKey(AppActivityInteractQuestion record);
}