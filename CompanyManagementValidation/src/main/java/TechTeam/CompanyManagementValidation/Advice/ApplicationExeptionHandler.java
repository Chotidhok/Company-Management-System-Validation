package TechTeam.CompanyManagementValidation.Advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;


import TechTeam.CompanyManagementValidation.Exeption.UserNotFoundExeption;

@RestControllerAdvice
public class ApplicationExeptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }
	

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
   @ExceptionHandler(UserNotFoundExeption.class)
    public Map<String, String> handleBusinessException(UserNotFoundExeption ex) {
    	
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }

}
