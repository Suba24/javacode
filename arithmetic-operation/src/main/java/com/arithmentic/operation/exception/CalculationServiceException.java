package com.arithmentic.operation.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CalculationServiceException {
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex)
	{
	    //Handle all exception..
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("/error");
	    modelAndView.addObject("message", ex.getMessage());
	    return modelAndView;
	}
}
