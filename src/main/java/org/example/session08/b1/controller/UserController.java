package org.example.session08.b1.controller;

import jakarta.validation.Valid;
import org.example.session08.b1.dto.AddressDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class UserController {
    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@Valid @RequestBody AddressDto addressDto) {
        // logig lưu DBase
        return ResponseEntity.ok("Cập nhật địa chỉ thành công");
    }
}
