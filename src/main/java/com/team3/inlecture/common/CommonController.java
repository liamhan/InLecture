package com.team3.inlecture.common;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team3.inlecture.authentication.UserAuth;

@Controller
public class CommonController {
	@RequestMapping(value = "error", method = RequestMethod.GET)
	public String errorPage(@RequestParam(value="errorMsg", required=false) String error, Model model) {
		model.addAttribute("errorMsg", error);
		return "common/error";
	}
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(Model model, Authentication authentication) {
		if(authentication != null){
		UserAuth user = (UserAuth) authentication.getPrincipal(); // Authentication 저장된 principal 객체를 User 객체로 Cast
		if(user!=null && user.getUsername() != null)
			System.out.println(user.getUsername());
		}
//		UserAuth userDetails = (UserAuth) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		UserAuth user2 = (UserAuth)session.getAttribute("userLoginInfo");
//		model.addAttribute("ROLE", user);
		return "common/main";
	}
}
