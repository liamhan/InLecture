package com.team3.inlecture.subject;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "subject")
public class SubjectController {
	
	@Secured("ROLE_TEACHER")
	@RequestMapping(value = "/subjectInsertPage.do", method = RequestMethod.GET)
	public String subjectInsertPage(Model model) {
		
		return "subject/subjectInsert";
	}
}
