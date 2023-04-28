package com.fitness.service;


import com.fitness.dao.EmployeesMapper;
import com.fitness.dao.PositionsMapper;
import com.fitness.entity.Employees;
import com.fitness.entity.PageUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployyeesServiceImpl implements EmployeesService {
    @Resource
    private EmployeesMapper employeesMapper;
    @Resource
    private PositionsMapper positionsMapper;

    @Override
    public PageUtils selectLike(String name, String email, String phone, Integer start, Integer pageSize) {
        if (name != null) name = "%" + name + "%";
        if (email != null) email = "%" + email + "%";
        if (phone != null) phone = "%" + phone + "%";
        Integer total = employeesMapper.count(name, email, phone);
        if (total == 0) return new PageUtils(start, pageSize, null, 0);
        List<Employees> employees = employeesMapper.selectLike(name, email, phone, start, pageSize);
        for (Employees e : employees) {
            e.setPositions(positionsMapper.selectById(e.getPosition()));
        }
        return new PageUtils(start, pageSize, employees, total);
    }

    @Override
    public void save(Employees employees) {
        employeesMapper.save(employees);
    }

    @Override
    public void delete(int id) {
        employeesMapper.delete(id);
    }

    @Override
    public void update(Employees employees) {
        employeesMapper.update(employees);
    }

    @Override
    public Employees selectById(int id) {
        Employees e = employeesMapper.selectById(id);
        e.setPositions(positionsMapper.selectById(e.getPosition()));
        return e;
    }

}
