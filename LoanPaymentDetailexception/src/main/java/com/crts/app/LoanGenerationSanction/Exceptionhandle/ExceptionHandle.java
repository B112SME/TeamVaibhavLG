package com.crts.app.LoanGenerationSanction.Exceptionhandle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crts.app.LoanGenerationSanction.Exception.CustomerNotFound;

import com.crts.app.LoanGenerationSanction.ExceptionResponse.ExceptionResponse;

@RestControllerAdvice
public class ExceptionHandle {
	@ExceptionHandler(CustomerNotFound.class)
	public ExceptionResponse exception(CustomerNotFound em,HttpServletRequest req) {
	ExceptionResponse res=new ExceptionResponse();
	res.setMsg("customer not found");
	res.setRequestUri(req.getRequestURI());
	res.setNumericStatusCode(HttpServletResponse.SC_NOT_FOUND);
	res.setStringStatusCode(HttpStatus.NOT_FOUND);
	return res;
	}

}
