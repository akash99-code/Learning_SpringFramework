package com.swami.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/student")

public class swamihello {
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"bookDetails.isbn"});
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,"returnDate", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/form.html", method= RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView model= new ModelAndView("LibForm");
		return model;
	
	}
	
	@RequestMapping(value="/submitLibraryForm.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("s1") Library s1, BindingResult result) {

		if(result.hasErrors())
		{
			ModelAndView model1 = new ModelAndView("LibForm");
			return model1;
		}
		ModelAndView model= new ModelAndView("FormSuccess");
		return model;
	
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("head","SSSIHL, MDH");
	}
	
}
