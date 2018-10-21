package com.nf147.dao;

import com.nf147.model.DeliveryRange;
import java.util.List;

public interface DeliveryRangeMapper {
    int deleteByPrimaryKey(Integer rangeId);

    int insert(DeliveryRange record);

    DeliveryRange selectByPrimaryKey(Integer rangeId);

    List<DeliveryRange> selectAll();

    int updateByPrimaryKey(DeliveryRange record);
}