package com.example.demo.service;

import com.example.demo.dto.SupplierDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class SupplierService implements IService<SupplierDto, Integer> {
    @Override
    public SupplierDto create(SupplierDto entity) {
        return null;
    }

    @Override
    public SupplierDto read(Integer id) {
        return null;
    }

    @Override
    public List<SupplierDto> read() {
        return List.of();
    }

    @Override
    public SupplierDto update(Integer id, SupplierDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
