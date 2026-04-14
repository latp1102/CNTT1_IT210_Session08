package org.example.session08.b3.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MultipleOfTenThousandValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MultipleOfTenThousand {
    String message() default "Số tiền phải >= 50.000 và là bội số của 10.000";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}