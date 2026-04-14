package org.example.session08.b5.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.example.session08.b5.annotation.ValidTourCode;
import org.example.session08.b5.annotation.ValidTourLogic;

import java.time.LocalDate;

@ValidTourLogic
public class TourDto {
    @NotBlank(message = "ko đc để trống mã tour")
    @ValidTourCode
    private String tourCode;
    @Positive(message = "giá người lớn > 0")
    private Double priceForAdult;
    @Positive(message = "giá trẻ em > 0")
    private Double priceForChild;
    private LocalDate startDate;
    private LocalDate endDate;

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(Double priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public Double getPriceForChild() {
        return priceForChild;
    }

    public void setPriceForChild(Double priceForChild) {
        this.priceForChild = priceForChild;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }
}
