package com.example.demo3h.mapper;

import com.example.demo3h.model.BusinessInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * Demo class
 *
 * @author 刘恒
 * @date 2018/12/28
 */
@Mapper
public interface BusinessInfoMapper {

    /**
     *查询所有商户表下所有发布的商品信息
     */
    List<BusinessInfo> findBusinessInfoResultMap();

    /**
     * 查询单个商品的详情
     */
    BusinessInfo findById(int id);

}
