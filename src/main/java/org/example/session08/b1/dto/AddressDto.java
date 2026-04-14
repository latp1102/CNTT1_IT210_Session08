package org.example.session08.b1.dto;

import jakarta.validation.constraints.NotBlank;

public class AddressDto {
    @NotBlank(message = "Tên người nhận ko đc để trống")
    private String receiverName;
    @NotBlank(message = "Địa chỉ ko đc thiếu")
    private String address;

}
