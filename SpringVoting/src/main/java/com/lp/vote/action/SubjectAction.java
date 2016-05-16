package com.lp.vote.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lp.vote.entity.AddSubjectBean;
import com.lp.vote.service.SubjectService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("subjectAction")
public class SubjectAction implements ModelDriven<AddSubjectBean>{
	
	private AddSubjectBean addSubjectBean;
	
	@Autowired
	private SubjectService subjectService;
	
	public String save(){
		LogManager.getLogger().debug("SubjectAction  ==> 进来...."+addSubjectBean);
		
		try {
			subjectService.add(addSubjectBean);
			return "saveSucess";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "none";
	}

	@Override
	public AddSubjectBean getModel() {
		addSubjectBean = new AddSubjectBean();
		return addSubjectBean;
	}
}
