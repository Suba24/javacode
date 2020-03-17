package com.arithmentic.operation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.arithmentic.operation.service.CalculationService;

@Controller

public class CalculationController {
	private static final String HOMEPAGE="home";
	
	@Autowired
	private CalculationService calculationService;
	
	public CalculationService getCalculationService() {
		return calculationService;
	}

	public void setCalculationService(CalculationService calculationService) {
		this.calculationService = calculationService;
	}

	@RequestMapping(value="/calculation", method=RequestMethod.GET)
	public String homePage(){
		return HOMEPAGE;
	}
	
	//save
	
	@PostMapping("/calculation/save")
	public RedirectView saveData(@Valid @RequestParam("expression") String expression, RedirectAttributes redirectAttributes){
		int data = getCalculationService().saveData(expression);
		
		RedirectView view = new RedirectView("/calculation/dispaly");
		redirectAttributes.addFlashAttribute("data", data);
		//return "redirect:/calculation/dispaly";
		return view;
	}
	//disaplay
	@GetMapping("/calculation/dispaly")
	public String displayData(Model model){
		model.asMap().put("data",model.getAttribute("data"));
		return "result";
	}
}