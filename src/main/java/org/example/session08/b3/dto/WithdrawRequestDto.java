package org.example.session08.b3.dto;

import jakarta.validation.constraints.NotNull;
import org.example.session08.b3.annotation.MultipleOfTenThousand;

public class WithdrawRequestDto {
    @NotNull(message = "Số tiền rút không được để trống")
    @MultipleOfTenThousand
    private Long withdrawAmount;
    public Long getWithdrawAmount() {
        return withdrawAmount;
    }
    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
