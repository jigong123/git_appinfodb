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

	
	
	
	//--前台代码块--！！！！！
	@RequestMapping("/statics/jsp/dologin")
	public String dologin(HttpServletRequest request) {
		Dev_User devUserSession = new Dev_User();
		devUserSession.setDevName("张三");
		devUserSession.setId(1);
		request.setAttribute("devUserSession",devUserSession);
		return "developer/main";
	}
	@RequestMapping("dev/flatform/app/list")
	public String list(){
		return "developer/appinfolist";
	}
	@RequestMapping("dev/flatform/app/appinfoadd")
	public String appinfoadd() {
		return "developer/appinfoadd";
	}
	@RequestMapping("dev/flatform/app/addversionsave")
	public String addversionsave() {
		return "";
	}
	
}