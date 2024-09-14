package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.interfaces.IService;

import java.util.List;

public class UserService implements IService<UserDto, Integer> {
    @Override
    public UserDto create(UserDto entity) {
        return null;
    }

    @Override
    public UserDto read(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> read() {
        return null;
    }

    @Override
    public UserDto update(Integer id, UserDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
