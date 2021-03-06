package arrmod.exceptionHanding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CompanyGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CompanyIncorrectData> handlerException(NoSuchCompanyException exception){
        CompanyIncorrectData data = new CompanyIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CompanyIncorrectData> handlerException(Exception exception){
        CompanyIncorrectData data = new CompanyIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data,HttpStatus.BAD_REQUEST);
    }
}
