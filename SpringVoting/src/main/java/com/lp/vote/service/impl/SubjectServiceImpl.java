package com.lp.vote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lp.vote.entity.AddSubjectBean;
import com.lp.vote.entity.Item;
import com.lp.vote.entity.Option;
import com.lp.vote.entity.OptionBean;
import com.lp.vote.entity.Subject;
import com.lp.vote.entity.SubjectBean;
import com.lp.vote.entity.VoteBean;
import com.lp.vote.mapper.SubjectMapper;
import com.lp.vote.service.SubjectService;
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public List<SubjectBean> getAllSub() {
		
		return subjectMapper.getAllSub();
	}
	@Override
	public OptionBean getOptionsByVsid(int vsId) {
		return subjectMapper.getOptionsByVsid(vsId);
	}
	@Override
	public VoteBean getVoteBeanByVsId(int vsId) {
		return subjectMapper.getVoteBeanByVsId(vsId);
	}
	@Override
	public AddSubjectBean addSubject(AddSubjectBean addSubjectBean) {
		subjectMapper.insertSubject(addSubjectBean);
		return addSubjectBean;
	}
	@Override
	public void addOption(Option option) {
		subjectMapper.insertOption(option);
	}
	@Override
	public void add(AddSubjectBean addSubjectBean) {
		addSubjectBean =addSubject(addSubjectBean);
		
		List<String> options=addSubjectBean.getOptions();
		
		for(int i=0;i<options.size();i++){
			Option option=new Option(options.get(i),addSubjectBean.getVsId(),i+1);
			addOption(option);
		}
	}
	@Override @Transactional
	public boolean saveVote(Item item){
		try {
			subjectMapper.insertItem(item);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override @Transactional
	public boolean saveVote(Item item, String[] voId) {
		boolean flag=true;
		if(voId.length>1){
			for(String v:voId){
				item.setVoId(Integer.valueOf(v));
				if(!saveVote(item)){
					return false;
				}
			}
			return true;
		}
		return saveVote(item);
	}
	
}
