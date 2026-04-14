package org.example.session08.b5.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidTourCodeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTourCode {
    String message() default "mã tourphairi VN_ hoặc int_  5 chữ số";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
