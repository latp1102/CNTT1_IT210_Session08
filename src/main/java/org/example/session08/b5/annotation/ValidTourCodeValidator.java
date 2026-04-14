package org.example.session08.b5.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidTourCodeValidator implements ConstraintValidator<ValidTourCode, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null){
            return true;
        }
        String regex = "^VN_\\d{5}$";
        return value.matches(regex);
    }
}
