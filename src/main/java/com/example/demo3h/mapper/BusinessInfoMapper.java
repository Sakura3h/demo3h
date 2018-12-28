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

    List<BusinessInfo> findBusinessInfoResultMap();

}
