package home.validation.checkEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.endsWith(endOfEmail);
    }
}
