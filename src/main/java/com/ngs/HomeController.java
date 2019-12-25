package com.ngs;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController{
	
	@RequestMapping("home")
	public ModelAndView Home(@RequestParam("name") String myName) {
//		System.out.println("Inside Home method");
//		String name=req.getParameter("name");
//		System.out.println("name:"+name);
//		
//		HttpSession session=req.getSession();
//		session.setAttribute("name", name);
		
//		session.setAttribute("name", myName);
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("Home");
		
					
		return mv;
	}
}
