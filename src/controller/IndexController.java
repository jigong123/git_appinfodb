package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Dev_User;

@Controller
public class IndexController {
	//TestDaoService helloSpring = (TestDaoService) context.getBean("testDaoService") ;)

	@RequestMapping("/statics/jsp/dologin")
	public String dologin(HttpServletRequest request) {
		Dev_User devUserSession = new Dev_User();
		devUserSession.setDevName("ÕÅÈý");
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