package com.stock.accelerator.web.dao;

import com.stock.accelerator.web.entity.SaCode;
import com.stock.accelerator.web.entity.SaCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SaCodeMapper {
    long countByExample(SaCodeExample example);

    int deleteByExample(SaCodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SaCode record);

    int insertSelective(SaCode record);

    List<SaCode> selectByExampleWithRowbounds(SaCodeExample example, RowBounds rowBounds);

    List<SaCode> selectByExample(SaCodeExample example);

    SaCode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SaCode record, @Param("example") SaCodeExample example);

    int updateByExample(@Param("record") SaCode record, @Param("example") SaCodeExample example);

    int updateByPrimaryKeySelective(SaCode record);

    int updateByPrimaryKey(SaCode record);
}