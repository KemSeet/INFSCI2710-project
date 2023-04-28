package com.fitness.dao;

import com.fitness.entity.Customers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomersMapper {
    Integer count(@Param("name") String name, @Param("email")  String email, @Param("phone")  String phone);
    List<Customers> selectLike(@Param("name") String name, @Param("email") String email, @Param("phone")  String phone,
                               @Param("start") Integer start, @Param("pageSize") Integer pageSize);
    void save(Customers customers);
    void delete(int id);
    void update(Customers customers);
    Customers selectById(int id);
}
