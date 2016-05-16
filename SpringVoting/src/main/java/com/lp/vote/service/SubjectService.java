package com.lp.vote.service;

import java.util.List;

import com.lp.vote.entity.AddSubjectBean;
import com.lp.vote.entity.Item;
import com.lp.vote.entity.Option;
import com.lp.vote.entity.OptionBean;
import com.lp.vote.entity.Subject;
import com.lp.vote.entity.SubjectBean;
import com.lp.vote.entity.VoteBean;

public interface SubjectService {
	List<SubjectBean> getAllSub();
	OptionBean getOptionsByVsid(int vsId);
	VoteBean getVoteBeanByVsId(int vsId);
	AddSubjectBean addSubject(AddSubjectBean addSubjectBean);
	void addOption(Option options);
	void add(AddSubjectBean addSubjectBean);
	boolean saveVote(Item item,String[] voId);
	boolean saveVote(Item item);
}
