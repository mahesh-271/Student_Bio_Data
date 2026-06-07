package com.luv2code.cruddemo.Exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AddressNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDTO> handleResourceNotFoundException(AddressNotFoundException ex, HttpServletRequest request) {

       var errorDTO = ErrorDTO.builder ()
                .message ( ex.getMessage () )
                .statusCode ( HttpStatus.NOT_FOUND.value () )
                .time ( LocalDateTime.now () )
                .apiPath ( request.getRequestURI () )
                .build ();

        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EducationalDetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDTO> handleResourceNotFoundException(EducationalDetailsNotFoundException ex, HttpServletRequest request) {

        var errorDTO = ErrorDTO.builder ()
                .message ( ex.getMessage () )
                .statusCode ( HttpStatus.NOT_FOUND.value () )
                .time ( LocalDateTime.now () )
                .apiPath ( request.getRequestURI () )
                .build ();

        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FamilyDetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDTO> handleResourceNotFoundException(FamilyDetailsNotFoundException ex, HttpServletRequest request) {

        var errorDTO = ErrorDTO.builder ()
                .message ( ex.getMessage () )
                .statusCode ( HttpStatus.NOT_FOUND.value () )
                .time ( LocalDateTime.now () )
                .apiPath ( request.getRequestURI () )
                .build ();

        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDTO> handleResourceNotFoundException(StudentNotFoundException ex, HttpServletRequest request) {

        var errorDTO = ErrorDTO.builder ()
                .message ( ex.getMessage () )
                .statusCode ( HttpStatus.NOT_FOUND.value () )
                .time ( LocalDateTime.now () )
                .apiPath (request.getRequestURI ())
                .build ();

        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorDTO> handleInternalServerException(Exception ex, HttpServletRequest request){

        var errorDTO = ErrorDTO.builder ()
                .message ( ex.getMessage ())
                .statusCode ( HttpStatus.INTERNAL_SERVER_ERROR.value () )
                .time ( LocalDateTime.now () )
                .apiPath ( request.getRequestURI ())
                .build ();

        return new ResponseEntity<>(errorDTO , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
