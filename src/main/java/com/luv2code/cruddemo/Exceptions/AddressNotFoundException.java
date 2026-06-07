package com.luv2code.cruddemo.Exceptions;

public class AddressNotFoundException extends RuntimeException{

   public AddressNotFoundException(String message)
   {
       super(message);
   }
}
