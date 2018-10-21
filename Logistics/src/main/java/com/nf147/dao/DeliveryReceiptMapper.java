package com.nf147.dao;

import com.nf147.model.DeliveryReceipt;
import java.util.List;

public interface DeliveryReceiptMapper {
    int deleteByPrimaryKey(Integer deliveryReceiptId);

    int insert(DeliveryReceipt record);

    DeliveryReceipt selectByPrimaryKey(Integer deliveryReceiptId);

    List<DeliveryReceipt> selectAll();

    int updateByPrimaryKey(DeliveryReceipt record);
}