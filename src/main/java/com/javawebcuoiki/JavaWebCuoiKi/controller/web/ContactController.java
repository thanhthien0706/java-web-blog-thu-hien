package com.javawebcuoiki.JavaWebCuoiKi.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lien-he")
public class ContactController {
	@GetMapping()
	private ModelAndView getPage() {
		ModelAndView mav = new ModelAndView("web/contact.html");
		return mav;
	}
}
