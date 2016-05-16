package com.lp.vote.action;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.lp.vote.entity.Item;
import com.lp.vote.entity.OptionBean;
import com.lp.vote.entity.SubjectBean;
import com.lp.vote.entity.VoteBean;
import com.lp.vote.service.SubjectService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("VoteAction")
public class VoteAction implements ModelDriven<Item>, SessionAware{
	
	private Item item;
	
	@Autowired
	SubjectService subjectService;

	private Map<String, Object> session;
	
	
	
	
	public String list(){
		List<SubjectBean> sub=subjectService.getAllSub();
		session.put("AllSubject", sub);
		return "list";
	}
	public String view(){
		int vsid=Integer.valueOf(ServletActionContext.getRequest().getParameter("Id"));
		OptionBean opts=subjectService.getOptionsByVsid(vsid);
		System.out.println(opts);
		session.put("opts", opts);
		return "view";
	}
	public String vote(){
		int vsid=Integer.valueOf(ServletActionContext.getRequest().getParameter("Id"));
		VoteBean voteBean=subjectService.getVoteBeanByVsId(vsid);
		session.put("vote", voteBean);
		return "vote";
	}
	public String save(){
		String[] voId=ServletActionContext.getRequest().getParameterValues("voId");
		LogManager.getLogger().debug(item +"=============>"+Arrays.toString(voId)+ServletActionContext.getRequest().getSession().getAttribute("vote"));
		if(subjectService.saveVote(item, voId)){
			return "saveSuccess";
		}
		return "none";
	}
	@Override
	public Item getModel() {
		item=new Item();
		return item;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	
}
