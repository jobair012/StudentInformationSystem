package me.jobair012.sis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

	// public ModelAndView login(@RequestParam(value = "error", required =
	// false) String error,
	// @RequestParam(value = "logout", required = false) String logout) {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error) {

		ModelAndView model = new ModelAndView("loginPage");
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		/*
		 * if (logout != null) { model.addObject("msg",
		 * "You've been logged out successfully."); }
		 */

		return model;

	}

}
