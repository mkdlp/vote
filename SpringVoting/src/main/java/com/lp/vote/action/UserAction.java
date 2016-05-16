package com.lp.vote.action;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lp.vote.entity.User;
import com.lp.vote.service.UserService;
import com.lp.vote.util.VoteData;
import com.opensymphony.xwork2.ModelDriven;
@Controller("UserAction")
public class UserAction implements ModelDriven<User>,SessionAware{
	private User user;
	private Map<String,Object> session;
	
	@Autowired
	private UserService userService;
	
	public String login(){
		LogManager.getLogger().debug("login登陆操作....");
		LogManager.getLogger().debug("login登录数据操作==>"+user);
		user=userService.login(user);
		if(user==null){
			session.put(VoteData.ERROR_MSG, "用户名密码错误!!!");
			return "login";
		}
		session.put(VoteData.LOGIN_USER, user);
		return "loginSuccess";
	}
	
	
	@Override
	public User getModel() {
		user=new User();
		return user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
}
