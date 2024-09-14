package com.example.demo.interfaces;

import java.util.List;

public interface IResource<T, N> {

    /**
     * Mètodo para criar T
     * @param entity
     * @return
     */
    public T create(T entity);

    /**
     * Método para consultar T baseado no identificador N informado
     * @param id
     * @return
     */
    public T get(N id);

    /**
     * Retorna uma lista de T
     * @return
     */
    public List<T> get();

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     * @param id
     * @param entity
     * @return
     */
    public T update(N id, T entity);

    /**
     * Deleta um registro com base no identificador N(id)
     * @param id
     */
    public void delete(N id);

}
