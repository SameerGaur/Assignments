package springMVCQ3.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public ModelAndView startMethod() {
		
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView loginCheck(@Valid @ModelAttribute("user") UserClass user, BindingResult result) {
		System.out.println("loginCheck moudule is in working...");
		System.out.println(user.getUsername());
		if(result.hasErrors()) {
			System.out.println("Error.......");
			ModelAndView model = new ModelAndView("login");
			return model;
		}
		if(user.getUsername().equals("Sameer") && user.getPassword().equals("1234")) {
			ModelAndView model = new ModelAndView("success");
			return model;
		}
		else {
			ModelAndView model = new ModelAndView("error");
			return model;
		}
	}
}
