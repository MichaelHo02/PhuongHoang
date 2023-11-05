package com.phuonghoang.productservice.services;

public interface CrudService<T, ID> {
    Iterable<T> createAll(Iterable<T> ins);

    T create(T in);

    T get(ID id);

    T update(T in);

    Boolean delete(ID id);
}
