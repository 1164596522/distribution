package com.nf147.dao;

import com.nf147.model.CityArea;
import java.util.List;

public interface CityAreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(CityArea record);

    CityArea selectByPrimaryKey(Integer areaId);

    List<CityArea> selectAll();

    int updateByPrimaryKey(CityArea record);
}