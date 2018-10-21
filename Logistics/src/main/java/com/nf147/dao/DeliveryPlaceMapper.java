package com.nf147.dao;

import com.nf147.model.DeliveryPlace;
import java.util.List;

public interface DeliveryPlaceMapper {
    int deleteByPrimaryKey(Integer depId);

    int insert(DeliveryPlace record);

    DeliveryPlace selectByPrimaryKey(Integer depId);

    List<DeliveryPlace> selectAll();

    int updateByPrimaryKey(DeliveryPlace record);
}