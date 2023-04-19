package com.example.springbootexception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.19
 */
@RestController
public class SampleController {
    @GetMapping
    public String hello() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
//    public ResponseEntity<AppError> sampleError(SampleException e) {
    public AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("IDKINDKIDK");
        return appError;
    }
}
