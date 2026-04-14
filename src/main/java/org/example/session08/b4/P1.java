package org.example.session08.b4;

import jakarta.validation.Valid;
import jdk.jfr.Registered;
import org.springframework.validation.BindingResult;

public class P1 {
    // input: username, password, confirm password
    // output: password = confirm password -> hợp lệ
    // output: password != confirm password -> không hợp lệ
    // giải pháp 1:
//    public String register(@Valid RegisteredDto dto, BindingResult result) {
//        if (!dto.getPassword().equals(dto.getConfirmPassword())){
//            result.rejectValue("confirmPassword", "", "");
//        }
//        if (result.hasErrors()){
//            return "register-form";
//        }
//        return "success";
//    }
    // giải pháp 2:
    // tạo @PasswordMatches gắn trực tiếp trên dto

    // P2
    // so sánh và lựa chọn
    // tiêu chí: | controller if-else | class annotation
    // boilerplate code:| nhều        | ít
    // tái sử dụng: | ko | có
    // clean code: | không | có
    // dễ bảo trì: | không | có
    // chuẩn spring: | không | có
}
