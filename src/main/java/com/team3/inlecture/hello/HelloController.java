package com.team3.inlecture.hello;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HelloController {
	Logger log = Logger.getLogger(this.getClass());
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		log.debug("인터셉터 테스트");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
