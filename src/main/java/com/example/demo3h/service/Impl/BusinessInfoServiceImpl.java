package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.BusinessInfoMapper;
import com.example.demo3h.model.BusinessInfo;
import com.example.demo3h.service.BusinessInfoService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo class
 *
 * @author 刘恒
 * @date 2018/12/28
 */
@Service
public class BusinessInfoServiceImpl implements BusinessInfoService {
    @Resource
    private BusinessInfoMapper businessInfoMapper;
    @Override
    @Cacheable(key = "'businessInfo'", value = "info")
    public  List<BusinessInfo> findBusinessInfoResultMap(){
        return businessInfoMapper.findBusinessInfoResultMap();
}


}
