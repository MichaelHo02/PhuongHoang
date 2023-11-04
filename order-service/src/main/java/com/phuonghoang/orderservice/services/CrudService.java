package com.phuonghoang.orderservice.services;

public interface CrudService<T, ID> {
    T create(T t);

    T get(ID id);

    T update(T t, ID id);

    Boolean delete(ID id);
}
