package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class ProductService implements IService<ProductDto, Integer> {
    @Override
    public ProductDto create(ProductDto entity) {
        return null;
    }

    @Override
    public ProductDto read(Integer id) {
        return null;
    }

    @Override
    public List<ProductDto> read() {
        return List.of();
    }

    @Override
    public ProductDto update(Integer id, ProductDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
