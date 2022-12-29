package com.javawebcuoiki.JavaWebCuoiKi.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/the-loai")
public class CategoryController {
	@GetMapping("/{slugCategory}")
	private ModelAndView getPage() {
		ModelAndView mav = new ModelAndView("web/category.html");
		return mav;
	}
}
