package com.lp.vote.mapper;


import com.lp.vote.entity.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(Long viid);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long viid);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}