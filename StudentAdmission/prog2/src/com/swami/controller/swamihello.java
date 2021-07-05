package com.swami.controller;

import java.text.SimpleDateFormat;
import javax.validation.Valid;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/akash")  /////class level annotation

public class swamihello {
	/**@RequestMapping("/welcome/{instname}/{stuname}")
	public ModelAndView helloWorld(@PathVariable("stuname") String name,@PathVariable("instname") String inst) {
		ModelAndView model= new ModelAndView("welcome");
		model.addObject("message","Sairam to "+name+" ,from "+inst+".");
		return model;
		
	}
	//multiaction controller
	@RequestMapping("/sai/{instname}/{stuname}")
	public ModelAndView saiWorld(@PathVariable Map<String,String> arr) {
		ModelAndView model= new ModelAndView("welcome");
		model.addObject("message","Sairam to "+arr.get("stuname")+", from "+arr.get("instname"));
		return model;
	
	}*/
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admission.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model= new ModelAndView("AdmissionForm");

		//model.addObject("head","SSSIHL");
		return model;
	
	}
	////using @RequestParam to req.getParameter();
	/**
	@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {
		Student s1=new Student();
		s1.setStudentName(reqPar.get("studentName"));
		s1.setStudentHobby(reqPar.get("studentHobby"));
		
		ModelAndView model= new ModelAndView("AdmissionSuccess");
		model.addObject("head","SSSIHL");
		model.addObject("s1",s1);
		return model;
	
	}*/
	
	//method level annotation
	@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Validated @ModelAttribute("s1") Student s1, BindingResult result) {

		if(result.hasErrors())
		{
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		ModelAndView model= new ModelAndView("AdmissionSuccess");
		//model.addObject("head","SSSIHL");
		return model;
	
	}
	
	//centering common model attributes
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("head","SSSIHL");
	}
	
}
