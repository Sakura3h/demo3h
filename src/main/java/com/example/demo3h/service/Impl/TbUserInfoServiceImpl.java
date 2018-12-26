package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.TbUserInfoMapper;
import com.example.demo3h.model.TbUserInfo;
import com.example.demo3h.service.TbUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserInfoServiceImpl implements TbUserInfoService {
    @Autowired
    private TbUserInfoMapper tbUserInfoMapper;

    @Cacheable(key = "'tb_userinfo'", value = "user")
    public List<TbUserInfo> findAll() {
        return tbUserInfoMapper.findAll();
    }

    @Override
    @CacheEvict(key = "'tb_userinfo'", value = "user", allEntries = true)
    public int del(int id) {
        return tbUserInfoMapper.del(id);
    }

    public int add(TbUserInfo userInfo) {
        return tbUserInfoMapper.add(userInfo);
    }

    @CachePut(key = "'tb_userinfo'", value = "user")
    public List<TbUserInfo> find(){
        return tbUserInfoMapper.findAll();
    }

    @CachePut(key = "'tb_userinfo'",value = "user")
    public int upadate(TbUserInfo userInfo) {
        return  tbUserInfoMapper.update(userInfo);
    }

    @Cacheable(key = "#root.args[0]", value = "findById")
    public TbUserInfo findById(int id) {
        return  tbUserInfoMapper.findById(id);
    }
}
