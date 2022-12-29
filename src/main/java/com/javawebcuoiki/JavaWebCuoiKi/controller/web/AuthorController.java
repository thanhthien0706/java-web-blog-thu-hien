package com.javawebcuoiki.JavaWebCuoiKi.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tac-gia")
public class AuthorController {
	@GetMapping("/{slugName}")
	private ModelAndView getPage() {
		ModelAndView mav = new ModelAndView("web/author.html");
		return mav;
	}
}
