package com.lp.blank.test;


import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lp.vote.entity.OptionBean;
import com.lp.vote.entity.VoteBean;
import com.lp.vote.service.SubjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ConnTest {
	@Autowired
	private SubjectService subjectService;
	@Test
	public void test() {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
		DataSource source=(DataSource) cxt.getBean("dataSource");
		Connection con=null;
		
		try {
			con=source.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(con);
	}
	@Test
	public void test02() {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory source= (SqlSessionFactory) cxt.getBean("sqlSessionFactory");
		SqlSession session=source.openSession();
		Connection con=null;
		
		con=session.getConnection();
		assertNotNull(con);
	}
	@Test
	public void test03() {
		OptionBean options=subjectService.getOptionsByVsid(103);
		System.out.println(options);
		assertNotNull(options);
	}
	@Test
	public void test04() {
		VoteBean vote=subjectService.getVoteBeanByVsId(103);
		System.out.println(vote);
		assertNotNull(vote);
	}
	
	
	
}
