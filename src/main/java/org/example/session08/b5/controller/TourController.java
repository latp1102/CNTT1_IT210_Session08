package org.example.session08.b5.controller;

import jakarta.validation.Valid;
import org.example.session08.b5.dto.TourDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tour")
public class TourController {
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("tour", new TourDto());
        return "b5/create";
    }
    @PostMapping("/create")
    public String createTour(@Valid @ModelAttribute("tourDto") TourDto dto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "b5/create";
        }
        return "redirect:/tour/create";
    }
}
// test
// test1 — Mã tour phá hệ thống
// tourCode = ABC123
// @ValidTourCode chặn ngay
// không lưu DB
// không crash

// test2 — Logic giá sai
// adultPrice = 1.000.000
// childPrice = 2.000.000
// class Validator bắt lỗi
// hiện lỗi tại childPrice

// test3 — Null Injection
// adultPrice = null
// bean Validation xử lý
// không NullPointerException
