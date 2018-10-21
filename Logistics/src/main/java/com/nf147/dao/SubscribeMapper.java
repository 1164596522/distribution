package com.nf147.dao;

import com.nf147.model.Subscribe;
import java.util.List;

public interface SubscribeMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Subscribe record);

    Subscribe selectByPrimaryKey(Integer orderId);

    List<Subscribe> selectAll();

    int updateByPrimaryKey(Subscribe record);
}