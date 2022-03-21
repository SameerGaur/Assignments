package springMVCQ2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	double si;
	
	@RequestMapping(path="/simpleInterest", method = RequestMethod.POST)
	public ModelAndView simpleIntrest(@RequestParam("principal") String p,
										@RequestParam("time") String y, 
										@RequestParam("rate") String i) {
			System.out.println("Simple Interest Method is Working");
			//Creating model & view Object
			ModelAndView model = new ModelAndView();
			double a=Double.parseDouble(p);
			double t=Double.parseDouble(y);
			double r=Double.parseDouble(i);
			si = (a*t*r)/100;
			System.out.println(si);
			//setting the data
			model.addObject("SI", si);
			//setting the view name
			model.setViewName("simpleInterest");
		return model;	
	}
	
	@RequestMapping("/index")
	public ModelAndView testFunction() {
		System.out.println("Model....");
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	

}
