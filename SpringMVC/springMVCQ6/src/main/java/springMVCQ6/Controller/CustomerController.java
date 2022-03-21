package springMVCQ6.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("/registration")
	public String displayRegister(Model m){
		System.out.println(" displayRegister module is working ");
		m.addAttribute("customer", new Customer());
		return "registration";
	}
	
	@RequestMapping("/registeragain")
	public String submitForm(@Valid @ModelAttribute("customer") Customer e, BindingResult br) {
		System.out.println(" submitForm module is working ");
		if(br.hasErrors()) {
			return "registration";
		}
		else {
			return "final";
		}
	}
}
