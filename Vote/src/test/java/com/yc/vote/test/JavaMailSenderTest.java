package com.yc.vote.test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Test
	public void testSendEmail() {
		SimpleMailMessage smm=new SimpleMailMessage();//邮件信息类
		smm.setFrom("studymail_test@163.com");//邮件发送者
		smm.setTo("1872234785@qq.com"); //邮件接收者
		smm.setSubject("Spring邮件整合测试");//邮件主题
		smm.setText("Hi,spring邮件发送成功");//邮件内容
		javaMailSender.send(smm); //发送邮件
		System.out.println("邮件发送成功");
	}
	@Test
	public void testSendEmail02() {
		MimeMessage mm=javaMailSender.createMimeMessage();//邮件信息类
		
		try {
			MimeMessageHelper smm=new MimeMessageHelper(mm,true);
			smm.setFrom("studymail_test@163.com");//邮件发送者
			smm.setTo("992737266@qq.com"); //邮件接收者
			smm.setSubject("Spring邮件整合测试02");//邮件主题
			smm.setText("Hi,spring邮件发送成功<br>"
			+"<a href='www.baidu.com'>百度一下</a><br>"
			+"<img src='cid:images123' />",true);//邮件内容
			
			FileSystemResource fsr=new FileSystemResource("d:/caution.png");//创建文件系统资源
			smm.addInline("images123", fsr);//把内容ID与文件资源绑定起来
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		javaMailSender.send(mm); //发送邮件
		System.out.println("邮件发送成功");
	}
}
