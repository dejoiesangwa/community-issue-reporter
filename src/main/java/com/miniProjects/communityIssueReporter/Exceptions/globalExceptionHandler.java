package com.miniProjects.communityIssueReporter.Exceptions;

import com.miniProjects.communityIssueReporter.Entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandler {
    @ExceptionHandler(UserAlreadyExists.class)
    public ResponseEntity<String> handlerUserAlreadyExists(UserAlreadyExists e){
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(e.getMessage());
    }
    @ExceptionHandler(invalidCredentials.class)
    public ResponseEntity<String> handlerInvalidCredentials(invalidCredentials ex){
       return ResponseEntity
               .status(HttpStatus.UNAUTHORIZED)
               .body(ex.getMessage());
    }
}
