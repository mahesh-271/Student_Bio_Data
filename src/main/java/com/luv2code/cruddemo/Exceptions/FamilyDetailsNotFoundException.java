package com.luv2code.cruddemo.Exceptions;

public class FamilyDetailsNotFoundException extends RuntimeException{

   public FamilyDetailsNotFoundException(String message)
   {
       super(message);
   }
}
