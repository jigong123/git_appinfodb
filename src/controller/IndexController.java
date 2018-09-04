package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Dev_User;
import service.TestDaoService;

public class IndexController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	TestDaoService helloSpring = (TestDaoService) context.getBean("testDaoService") ;
	
	@RequestMapping("LoginServlet")
	public String LoginServlet(HttpServletRequest request){
		Dev_User us = new Dev_User();
		us.setDevCode(request.getParameter("devCode"));
		us.setDevPassword(request.getParameter("devPassword"));
		Dev_User Dev_User2 =helloSpring.dev_Login(us);
			
		if(Dev_User2!=null){
			request.getSession().setAttribute("Dev_UserSession", Dev_User2);
			return "frame";
		}else{
			return "login";
		}
	}
	
}