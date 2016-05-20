package com.team3.inlecture.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HelloController {
	@Autowired
    HelloService helloService;
	
	@RequestMapping("/welcome")
	public String helloWorld(Model model) {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		
		model.addAttribute("students", helloService.getStudentList());
		//return new ModelAndView("welcome", "message", message);
		return "welcome";
	}
}
