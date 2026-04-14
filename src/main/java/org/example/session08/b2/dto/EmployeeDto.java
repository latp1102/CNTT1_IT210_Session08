package org.example.session08.b2.dto;

import jakarta.validation.constraints.Min;

public class EmployeeDto {
    @Min(value = 18, message = "Tuổi phải từ 18 trở lên")
    private Integer age;

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
