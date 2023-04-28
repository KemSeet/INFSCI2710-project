package com.fitness.controller;

import com.fitness.entity.PageUtils;
import com.fitness.entity.Positions;
import com.fitness.entity.ResultEntity;
import com.fitness.service.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/positions")
public class PositionsController {
    @Autowired
    private PositionsService positionsService;

    @RequestMapping("/list")
    @ResponseBody
    public ResultEntity list(@RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "start", required = true) Integer start,
                             @RequestParam(value = "pageSize", defaultValue = "10",required = true) Integer pageSize) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            PageUtils pageUtils = positionsService.selectLike(name, start, pageSize);
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
    public ResultEntity save(Positions positions) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            positionsService.save(positions);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", positions);
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
            Positions positions = positionsService.selectById(id);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", positions);
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
            positionsService.delete(id);
            resultEntity.setResult(true);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

    @RequestMapping("/update")
    @ResponseBody
    public ResultEntity update(Positions positions) {
        ResultEntity resultEntity = new ResultEntity();
        try {
            positionsService.update(positions);
            resultEntity.setResult(true);
            resultEntity.setOther("datas", positions);
        } catch (Exception e) {
            resultEntity.setResult(false);
            resultEntity.setOther("message", e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        }
        return resultEntity;
    }

}
