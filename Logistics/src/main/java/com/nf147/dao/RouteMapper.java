package com.nf147.dao;

import com.nf147.model.Route;
import java.util.List;

public interface RouteMapper {
    int deleteByPrimaryKey(Integer routeId);

    int insert(Route record);

    Route selectByPrimaryKey(Integer routeId);

    List<Route> selectAll();

    int updateByPrimaryKey(Route record);
}