package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class OrderService implements IService<OrderDto, Integer> {
    @Override
    public OrderDto create(OrderDto entity) {
        return null;
    }

    @Override
    public OrderDto read(Integer id) {
        return null;
    }

    @Override
    public List<OrderDto> read() {
        return List.of();
    }

    @Override
    public OrderDto update(Integer id, OrderDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
