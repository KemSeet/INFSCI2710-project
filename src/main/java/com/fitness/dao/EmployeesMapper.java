package com.fitness.dao;

import com.fitness.entity.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeesMapper {
    Integer count(@Param("name") String name, @Param("email")  String email, @Param("phone")  String phone);
    List<Employees> selectLike(@Param("name") String name, @Param("email") String email, @Param("phone")  String phone,
                               @Param("start") Integer start, @Param("pageSize") Integer pageSize);
    void save(Employees employees);
    void delete(int id);
    void update(Employees employees);
    Employees selectById(int id);
}
