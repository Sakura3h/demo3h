package com.example.demo3h.service;

import com.example.demo3h.model.BusinessInfo;

import java.util.List;

/**
 * Demo class
 *
 * @author 刘恒
 * @date 2018/12/28
 */
public interface BusinessInfoService {

    List<BusinessInfo> findBusinessInfoResultMap();

    BusinessInfo findById(int id);

}
