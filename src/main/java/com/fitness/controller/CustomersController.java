package com.fitness.controller;

import com.fitness.entity.Customers;
import com.fitness.entity.PageUtils;
import com.fitness.entity.ResultEntity;
import com.fitness.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customers")
public class CustomersController {
    @Autowired
    private CustomersService customersService;

    @RequestMapping("/list")
    @ResponseBody
    public ResultEntity list(@RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "email", required = true) String email,
                             @RequestParam(value = "phone", required = true) String phone,
                             @RequestParam(value = "start", required = true) Integer start,
                             @RequestParam(value = "pageSize", defaultValue = "10",required = true) Integer pageSize) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            PageUtils pageUtils = customersService.selectLike(name, email, phone, start, pageSize);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", pageUtils);
        } catch (Exception e) {
            e.printStackTrace();
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResultEntity save(Customers customers) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            customersService.save(customers);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", customers);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public ResultEntity login(int id) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            Customers customers = customersService.selectById(id);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", customers);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResultEntity delete(int id) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            customersService.delete(id);
            resultEntity.setResult(true);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

    @RequestMapping("/update")
    @ResponseBody
    public ResultEntity update(Customers customers) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            customersService.update(customers);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", customers);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

}
