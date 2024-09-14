package com.example.demo.service;

import com.example.demo.dto.ShipperDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class ShipperService implements IService<ShipperDto, Integer> {
    @Override
    public ShipperDto create(ShipperDto entity) {
        return null;
    }

    @Override
    public ShipperDto read(Integer id) {
        return null;
    }

    @Override
    public List<ShipperDto> read() {
        return List.of();
    }

    @Override
    public ShipperDto update(Integer id, ShipperDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
