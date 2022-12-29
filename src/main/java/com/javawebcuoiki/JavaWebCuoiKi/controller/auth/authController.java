package com.javawebcuoiki.JavaWebCuoiKi.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class authController {

	@GetMapping("/dang-nhap")
	private ModelAndView getLogin() {
		ModelAndView mav = new ModelAndView("login.html");
		return mav;
	}

	@GetMapping("/dang-ky")
	private ModelAndView getSignUp() {
		ModelAndView mav = new ModelAndView("signup.html");
		return mav;
	}

}
