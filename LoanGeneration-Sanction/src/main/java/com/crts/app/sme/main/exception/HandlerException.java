package com.crts.app.sme.main.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class HandlerException {
@ExceptionHandler(LeadIdNotFound.class)
public ExceptionResponse exceptionResponse(LeadIdNotFound lnf,HttpServletRequest request)
{
	
	ExceptionResponse exr=new ExceptionResponse();
	exr.setMsg("Requested Lead Id is not Present!");
	exr.setRequestUri(request.getRequestURI());
	exr.setStringStatusCode(HttpStatus.BAD_REQUEST);
	
	return exr;
	
}
}
