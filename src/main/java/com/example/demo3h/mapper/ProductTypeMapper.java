package com.example.demo3h.mapper;

import com.example.demo3h.model.ProductType;

public interface ProductTypeMapper {

    int deleteByPrimaryKey(Integer ptid);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer ptid);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}