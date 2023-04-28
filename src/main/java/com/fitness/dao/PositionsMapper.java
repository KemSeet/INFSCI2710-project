package com.fitness.dao;

import com.fitness.entity.Positions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionsMapper {
    Integer count(@Param("name") String name);
    List<Positions> selectLike(@Param("name") String name,
                               @Param("start") Integer start, @Param("pageSize") Integer pageSize);
    void save(Positions positions);
    void delete(int id);
    void update(Positions positions);
    Positions selectById(int id);
}
