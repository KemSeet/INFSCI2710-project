package com.fitness.service;


import com.fitness.dao.CustomersMapper;
import com.fitness.entity.Customers;
import com.fitness.entity.PageUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Resource
    private CustomersMapper customersMapper;

    @Override
    public PageUtils selectLike(String name, String email, String phone, Integer start, Integer pageSize) {
        if (name != null) name = "%" + name + "%";
        if (email != null) email = "%" + email + "%";
        if (phone != null) phone = "%" + phone + "%";
        Integer total = customersMapper.count(name, email, phone);
        if (total == 0) return new PageUtils(start, pageSize, null, 0);
        List<Customers> customers = customersMapper.selectLike(name, email, phone, start, pageSize);
        return new PageUtils(start, pageSize, customers, total);
    }

    @Override
    public void save(Customers customers) {
        customers.setJoin_date(new Date(System.currentTimeMillis()));
        customersMapper.save(customers);
    }

    @Override
    public void delete(int id) {
        customersMapper.delete(id);
    }

    @Override
    public void update(Customers customers) {
        customersMapper.update(customers);
    }

    @Override
    public Customers selectById(int id) {
        return customersMapper.selectById(id);
    }

}
