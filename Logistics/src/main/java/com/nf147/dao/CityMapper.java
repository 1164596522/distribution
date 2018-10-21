package com.nf147.dao;

import com.nf147.model.City;
import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    City selectByPrimaryKey(Integer cityId);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}