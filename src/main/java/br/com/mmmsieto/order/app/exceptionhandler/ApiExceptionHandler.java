package br.com.mmmsieto.order.app.exceptionhandler;

import br.com.mmmsieto.order.domain.exceptions.DomainException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(DomainException.class)
    public ResponseEntity<?> getDomainException(DomainException domainException) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(domainException);
    }



}
