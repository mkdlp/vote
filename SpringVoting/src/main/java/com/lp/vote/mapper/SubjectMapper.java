package com.lp.vote.mapper;

import java.util.List;

import com.lp.vote.entity.AddSubjectBean;
import com.lp.vote.entity.Item;
import com.lp.vote.entity.Option;
import com.lp.vote.entity.OptionBean;
import com.lp.vote.entity.SubjectBean;
import com.lp.vote.entity.VoteBean;

public interface SubjectMapper {
    List<SubjectBean> getAllSub();
    OptionBean getOptionsByVsid(int vsId);
    VoteBean getVoteBeanByVsId(int vsId);
    void insertItem(Item item);
    void insertSubject(AddSubjectBean addSubjectBean);
    void insertOption(Option option);
}