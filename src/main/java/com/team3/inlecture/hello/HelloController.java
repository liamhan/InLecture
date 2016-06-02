package com.team3.inlecture.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class HelloController {
	@Autowired
    private HelloService helloService;
	
	@RequestMapping("/welcome")
	public String helloWorld(Model model) {
		model.addAttribute("students", helloService.getStudentList());
		//return new ModelAndView("welcome", "message", message);
		return "welcome";
	}
}
