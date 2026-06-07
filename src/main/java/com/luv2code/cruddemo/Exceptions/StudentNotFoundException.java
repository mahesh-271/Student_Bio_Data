package com.luv2code.cruddemo.Exceptions;

public class StudentNotFoundException extends RuntimeException{

   public StudentNotFoundException(String message)
   {
       super(message);
   }
}
