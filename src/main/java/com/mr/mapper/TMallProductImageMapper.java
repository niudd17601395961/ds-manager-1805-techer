package com.mr.mapper;

import java.util.Map;

import com.mr.model.TMallProductImage;

public interface TMallProductImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMallProductImage record);

    int insertSelective(TMallProductImage record);

    TMallProductImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMallProductImage record);

    int updateByPrimaryKey(TMallProductImage record);

	void insertSelectives(Map<String, Object> map);
}