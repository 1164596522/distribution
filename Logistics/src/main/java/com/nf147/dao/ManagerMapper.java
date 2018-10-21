package com.nf147.dao;

import com.nf147.model.Manager;
import java.util.List;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer mqId);

    int insert(Manager record);

    Manager selectByPrimaryKey(Integer mqId);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
}