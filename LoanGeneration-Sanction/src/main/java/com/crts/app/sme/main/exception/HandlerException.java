package com.crts.app.sme.main.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class HandlerException 
{
	@ExceptionHandler(LoanIdNotFound.class)
	public ExceptionResponse exceptionResponse(LoanIdNotFound lnf,HttpServletRequest request)
	{
		
		ExceptionResponse exr=new ExceptionResponse();
		exr.setMsg("Requested Loan Id is not Present!");
		exr.setRequestUri(request.getRequestURI());
		exr.setStringStatusCode(HttpStatus.BAD_REQUEST);
		
		return exr;
		
	}

}
