package net.rodrigocarvalho.licenseserver.handler;

import net.rodrigocarvalho.licenseserver.exception.ResourceNotFoundDetails;
import net.rodrigocarvalho.licenseserver.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception) {
        ResourceNotFoundDetails build = ResourceNotFoundDetails.Builder.newBuilder()
                .timestamp(System.currentTimeMillis())
                .status(HttpStatus.NOT_FOUND.value())
                .title("License not found")
                .reason(exception.getMessage())
                .build();
        return new ResponseEntity<>(build, HttpStatus.NOT_FOUND);
    }
}