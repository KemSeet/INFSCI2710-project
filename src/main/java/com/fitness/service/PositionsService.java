package com.fitness.service;


import com.fitness.entity.PageUtils;
import com.fitness.entity.Positions;

public interface PositionsService {
    PageUtils selectLike(String name, Integer start, Integer pageSize);
    void save(Positions positions);
    void delete(int id);
    void update(Positions positions);
    Positions selectById(int id);
}
