package com.javawebcuoiki.JavaWebCuoiKi.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bai-viet")
public class PostController {
	@GetMapping("/{slugPost}")
	private ModelAndView getPage() {
		ModelAndView mav = new ModelAndView("web/post-detail.html");
		return mav;
	}
}
