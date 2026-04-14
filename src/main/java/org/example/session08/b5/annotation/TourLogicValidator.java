package org.example.session08.b5.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.session08.b5.dto.TourDto;

import java.time.LocalDate;

public class TourLogicValidator implements ConstraintValidator<ValidTourLogic, TourDto> {
    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {
        if (dto == null) {
            return true;
        }
        boolean valid = true;
        context.disableDefaultConstraintViolation();
        if (dto.getPriceForChild() != null && dto.getPriceForAdult() != null && dto.getPriceForChild() > dto.getPriceForAdult()) {
            context.buildConstraintViolationWithTemplate("Giá trẻ em phải <= giá người lớn").addPropertyNode("childPrice").addConstraintViolation();
            valid = false;
        }
        if (dto.getStartDate() != null && dto.getStartDate().isBefore(LocalDate.now())) {
            context.buildConstraintViolationWithTemplate("Ngày khởi hành phải từ hôm nay").addPropertyNode("startDate").addConstraintViolation();
            valid = false;
        }
        if (dto.getStartDate() != null && dto.getEndDate() != null && !dto.getEndDate().isAfter(dto.getStartDate())) {
            context.buildConstraintViolationWithTemplate("Ngày kết thúc phải sau ngày khởi hành").addPropertyNode("endDate").addConstraintViolation();
            valid = false;
        }
        return valid;
    }
}
