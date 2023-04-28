package com.fitness.service;


import com.fitness.entity.Customers;
import com.fitness.entity.PageUtils;

public interface CustomersService {
    PageUtils selectLike(String name, String email, String phone, Integer start, Integer pageSize);
    void save(Customers customers);
    void delete(int id);
    void update(Customers customers);
    Customers selectById(int id);
}
