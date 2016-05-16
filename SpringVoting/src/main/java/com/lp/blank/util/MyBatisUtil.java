package com.lp.blank.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;
	
	static{
		try {
			InputStream in = Resources.getResourceAsStream("mybatis.xml");
			factory=new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSession(){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession();
		}
		return session;		
	}
	
	public static SqlSession getSession(boolean isAutoCommit){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession(isAutoCommit);
		}
		return session;		
	}
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
