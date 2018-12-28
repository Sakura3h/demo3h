package com.example.demo3h.service.Impl;

import com.example.demo3h.mapper.PorductMapper;
import com.example.demo3h.model.Porduct;
import com.example.demo3h.model.ProductType;
import com.example.demo3h.service.PorductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PorductServiceImpl implements PorductService {
    @Resource
    private PorductMapper porductMapper;
    public List<Porduct> selectAll(Porduct porduct) {
        return porductMapper.selectAll(porduct);
    }

    public List<ProductType> selectNameAll() {
        return porductMapper.selectNameAll();
    }
}
