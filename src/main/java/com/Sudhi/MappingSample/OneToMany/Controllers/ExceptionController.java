package com.Sudhi.MappingSample.OneToMany.Controllers;

import com.Sudhi.MappingSample.OneToMany.Exceptions.ExceptionBody;
import com.Sudhi.MappingSample.OneToMany.Exceptions.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController

public class ExceptionController extends ResponseEntityExceptionHandler {

@ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<ExceptionBody> handleException(IdNotFoundException exception, WebRequest webReq){
        ExceptionBody error= new ExceptionBody();
       error.setCode(101);
       error.setMessage(exception.getMessage());
       return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
