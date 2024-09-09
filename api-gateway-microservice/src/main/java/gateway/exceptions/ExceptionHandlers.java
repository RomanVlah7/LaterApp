package gateway.exceptions;

import gateway.exceptions.exceptions.UserAlreadyExistsException;
import gateway.exceptions.exceptions.UserNotFounfException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlers {

    @ResponseBody
    @ExceptionHandler
    public static ResponseEntity<Map<String, String>> userAlreadyExistsException(UserAlreadyExistsException e) {
        return new ResponseEntity<>(
                Map.of(e.getMessage(), "400"),
                HttpStatus.BAD_REQUEST
        );
    }

    @ResponseBody
    @ExceptionHandler
    public static ResponseEntity<Map<String, String>> userNotFoundException(UserNotFounfException e) {
        return new ResponseEntity<>(
                Map.of(e.getMessage(), "404"),
                HttpStatus.NOT_FOUND
        );
    }
}
