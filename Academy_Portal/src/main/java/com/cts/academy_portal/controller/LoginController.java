package com.cts.academy_portal.controller;


import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.cts.academy_portal.bean.Login;
import com.cts.academy_portal.service.LoginService;



@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory getSessionFactory;
	
	@Autowired
	private LoginService loginService;
	

	@RequestMapping("login.html")
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="logout.html")
	public ModelAndView logout(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		httpSession.invalidate();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@GetMapping("logout1.html")
	public String log(){
		System.out.println("in get");
		return "login";
	}
	
	@GetMapping("adminHome1.html")
	public ModelAndView goToHome( HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		Login logi = (Login)httpSession.getAttribute("login_object");
		modelAndView.addObject("user", logi);
		modelAndView.setViewName("adminHome");
		
		return modelAndView;
	}
	
	@GetMapping("facultyHome1.html")
	public ModelAndView goToFacultyHome( HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		Login logi = (Login)httpSession.getAttribute("login_object");
		modelAndView.addObject("user", logi);
		modelAndView.setViewName("facultyHome");
		
		return modelAndView;
	}
	
	@RequestMapping("goToHome.html")
	public ModelAndView goToHomePage( HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		Login logi = (Login)httpSession.getAttribute("login_object");
		modelAndView.addObject("user", logi);
		if(logi.getUserType().equals("Admin")){
		modelAndView.setViewName("adminHome");
		}
		else{
			modelAndView.setViewName("facultyHome");
		}
		System.out.println("in get");
		return modelAndView;
	}

	
	@PostMapping(value="login.html")
	public ModelAndView validateUser(@ModelAttribute Login login, HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(login);
		if(loginService.authenticate(login.getUserName(), login.getPassword())!=null){
			Login login2 = loginService.authenticate(login.getUserName(), login.getPassword());
			httpSession.setAttribute("login_object", login2);
			/*if(login2.getUserStatus()==0){*/
				if(login2.getUserType().equals("Admin")){
					modelAndView.addObject("user", login2);
					String execute= loginService.sessionStarted(login.getUserName());
					modelAndView.setViewName("adminHome");
					}
					else if(login2.getUserType().equals("Faculty")){
						modelAndView.addObject("user", login2);
						String execeute= loginService.sessionStarted(login.getUserName());
						modelAndView.setViewName("facultyHome");		
						}	
			//}
			else if(login2.getUserStatus()==1){
				modelAndView.setViewName("alreadyLogedIn");
			}
			
	}	
		else{
			JOptionPane.showMessageDialog(null, "UserName and Password not matched");
			modelAndView.setViewName("login");
		}
		return modelAndView;
}	
}

