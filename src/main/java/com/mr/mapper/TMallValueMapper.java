package com.mr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mr.model.TMallValue;

public interface TMallValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMallValue record);

    int insertSelective(TMallValue record);

    TMallValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMallValue record);

    int updateByPrimaryKey(TMallValue record);

	void insertValue(@Param("shxmId") Integer shxmId, @Param("list") List<TMallValue> list);
}