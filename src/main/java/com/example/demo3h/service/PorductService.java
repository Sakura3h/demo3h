package com.example.demo3h.service;

import com.example.demo3h.model.Porduct;
import com.example.demo3h.model.ProductType;

import java.util.List;

public interface PorductService {
    List<Porduct> selectAll(Porduct porduct);

    List<ProductType> selectNameAll();
}

