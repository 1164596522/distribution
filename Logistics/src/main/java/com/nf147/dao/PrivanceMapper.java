package com.nf147.dao;

import com.nf147.model.Privance;
import java.util.List;

public interface PrivanceMapper {
    int deleteByPrimaryKey(Integer privanceId);

    int insert(Privance record);

    Privance selectByPrimaryKey(Integer privanceId);

    List<Privance> selectAll();

    int updateByPrimaryKey(Privance record);
}