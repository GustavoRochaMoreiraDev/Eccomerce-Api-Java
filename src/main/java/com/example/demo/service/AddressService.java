package com.example.demo.service;

import com.example.demo.dto.AddressDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class AddressService implements IService<AddressDto, Integer> {
    @Override
    public AddressDto create(AddressDto entity) {
        return null;
    }

    @Override
    public AddressDto read(Integer id) {
        return null;
    }

    @Override
    public List<AddressDto> read() {
        return List.of();
    }

    @Override
    public AddressDto update(Integer id, AddressDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
