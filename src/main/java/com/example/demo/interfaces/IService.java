package com.example.demo.interfaces;

import java.util.List;

public interface IService<T, N> {

    public T create(T entity);

    public T read(N id);

    public List<T> read();

    public T update(N id, T entity);

    public void delete(N id);


}
