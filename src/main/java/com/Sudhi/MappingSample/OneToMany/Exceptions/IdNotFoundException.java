package com.Sudhi.MappingSample.OneToMany.Exceptions;


public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String message){
        super(message);
        System.out.println("Exception");

    }
}
