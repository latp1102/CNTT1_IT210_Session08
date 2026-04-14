package org.example.session08.b3.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MultipleOfTenThousandValidator implements ConstraintValidator<MultipleOfTenThousand, Long>{
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        return false;
    }
}
