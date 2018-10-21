package com.nf147.dao;

import com.nf147.model.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cuId);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer cuId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}