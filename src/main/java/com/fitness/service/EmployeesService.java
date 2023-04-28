package com.fitness.service;


import com.fitness.entity.Employees;
import com.fitness.entity.PageUtils;

public interface EmployeesService {
    PageUtils selectLike(String name, String email, String phone, Integer start, Integer pageSize);
    void save(Employees employees);
    void delete(int id);
    void update(Employees employees);
    Employees selectById(int id);
}
