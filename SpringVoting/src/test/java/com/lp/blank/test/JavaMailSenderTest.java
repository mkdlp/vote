package com.lp.blank.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest {
	@Autowired
	private JavaMailSender javaMailSender;

	@Test
	public void test() {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("18773477307@163.com");
		smm.setTo("853843842@qq.com");
		smm.setSubject("what's up man");
		smm.setText("do u want play csgo with us,if u com we will be five!!!");
		
		javaMailSender.send(smm);
		System.out.println("it's successfull!");
	}

}
