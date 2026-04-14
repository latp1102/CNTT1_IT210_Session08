package org.example.session08.b4.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.session08.b4.dto.RegisterDto;

import java.util.Objects;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, RegisterDto> {
    @Override
    public boolean isValid(RegisterDto dto, ConstraintValidatorContext context) {
        if(dto==null){
            return true;
        }
        String password = dto.getPassword();
        String confirmPassword = dto.getConfirmPassword();

        if(password==null || confirmPassword==null){
            return false;
        }
        boolean matches = Objects.equals(password, confirmPassword);
        if(!matches){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Password không khớp").addConstraintViolation();
        }
        return matches;
    }
}
