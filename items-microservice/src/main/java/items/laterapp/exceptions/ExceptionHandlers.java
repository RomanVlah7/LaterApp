package items.laterapp.exceptions;

import items.laterapp.exceptions.exceptions.ItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

public class ExceptionHandlers {
    @ResponseBody
    @ExceptionHandler
    public static ResponseEntity<Map<String, String>> itemNotFoundExceptions(ItemNotFoundException e) {
        return new ResponseEntity<>(
                Map.of(e.getMessage(), "400"),
                HttpStatus.BAD_REQUEST
        );
    }
}
