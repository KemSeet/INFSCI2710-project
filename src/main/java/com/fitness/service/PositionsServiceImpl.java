package com.fitness.service;


import com.fitness.dao.PositionsMapper;
import com.fitness.entity.PageUtils;
import com.fitness.entity.Positions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionsServiceImpl implements PositionsService {
    @Resource
    private PositionsMapper positionsMapper;

    @Override
    public PageUtils selectLike(String name, Integer start, Integer pageSize) {
        if (name != null) name = "%" + name + "%";
        Integer total = positionsMapper.count(name);
        if (total == 0) return new PageUtils(start, pageSize, null, 0);
        List<Positions> positions = positionsMapper.selectLike(name, start, pageSize);
        return new PageUtils(start, pageSize, positions, total);
    }

    @Override
    public void save(Positions positions) {
        positionsMapper.save(positions);
    }

    @Override
    public void delete(int id) {
        positionsMapper.delete(id);
    }

    @Override
    public void update(Positions positions) {
        positionsMapper.update(positions);
    }

    @Override
    public Positions selectById(int id) {
        return positionsMapper.selectById(id);
    }

}
