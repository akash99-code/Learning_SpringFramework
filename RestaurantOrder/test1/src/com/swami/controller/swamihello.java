package com.swami.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class swamihello {
	@RequestMapping("/Restaurant/south-dish")
	public ModelAndView helloWorld() {
		ModelAndView model= new ModelAndView("OrderForm");
		model.addObject("type","South");
		model.addObject("dish1","Idli");
		model.addObject("dish2","Wada");
		model.addObject("dish3","Dosa");
		return model;
		
	}
	@RequestMapping("/Restaurant/north-dish")
	public ModelAndView saiWorld(@PathVariable Map<String,String> arr) {
		ModelAndView model= new ModelAndView("OrderForm");
		model.addObject("type","North");
		model.addObject("dish1","Chapati");
		model.addObject("dish2","Paubhaji");
		model.addObject("dish3","ChanaBatora");
		return model;
	
	}
	
	@RequestMapping(value="/Restaurant/submitOrder.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("ORD") OrderDetails ORD) {
		ModelAndView model= new ModelAndView("OrderSuccess");
		return model;
	
	}
	
}
