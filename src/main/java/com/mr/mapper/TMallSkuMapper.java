package com.mr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mr.model.TMallSkuVO;
import com.mr.model.TMallSkuValue;

public interface TMallSkuMapper {
	
	void addSku(TMallSkuVO skuvo);

	void addSkuValue(@Param("list") List<TMallSkuValue> list, @Param("skuId") Integer skuId, @Param("shopId") Integer shopId);

}
