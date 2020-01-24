package com.crts.app.LoanGenrationandSanction.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandelException {
	
 @ExceptionHandler(LoanTypeNotFoundException.class)
	public ExceptionResponse exception(LoanTypeNotFoundException em,HttpServletRequest req) {
	ExceptionResponse res=new ExceptionResponse();
	res.setMsg("LoanType not found");
	res.setRequestUri(req.getRequestURI());
	res.setNumericStatusCode(HttpServletResponse.SC_NOT_FOUND);
	res.setStringStatusCode(HttpStatus.NOT_FOUND);
	return res;
}
	
 
}

