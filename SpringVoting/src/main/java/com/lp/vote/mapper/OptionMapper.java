package com.lp.vote.mapper;

import com.lp.vote.entity.Option;

public interface OptionMapper {
    int deleteByPrimaryKey(Long voId);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Long voId);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}