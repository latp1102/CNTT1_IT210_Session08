package org.example.session08.b1;

public class P1 {
    // lỗi 1: lọt khoảng trắng và data
    // @NotNull chỉ kiểm tra giá trị ≠ null, nên dùng @NotBlank
    // nhập Space → String vẫn tồn tại -> validation PASS -> lưu DB

    // lỗi 2 Không chặn được request từ Postman gây lỗi 50
    // public ResponseEntity<String> updateAddress(@RequestBody AddressDto addressDto)
    // thiếu @valid , Bean Validation ko hoạt động đc
}
