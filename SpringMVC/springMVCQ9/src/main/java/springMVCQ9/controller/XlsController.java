package springMVCQ9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import springMVCQ9.dao.EmpDao;
import springMVCQ9.model.Employee;
import springMVCQ9.service.GenerateXlsReport;

@Controller
public class XlsController {
	@Autowired    
    EmpDao dao; 
	@RequestMapping(value="/xlsSheet", method=RequestMethod.GET)
	public ModelAndView getExcel(){
	    List<Employee> empList = (List<Employee>) dao.getAllEmployees();		
	    ModelAndView mv = new ModelAndView(new GenerateXlsReport(), "empList", empList);
	    return mv;
	}
}

