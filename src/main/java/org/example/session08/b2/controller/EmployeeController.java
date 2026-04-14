package org.example.session08.b2.controller;

import jakarta.validation.Valid;
import org.example.session08.b2.dto.EmployeeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @GetMapping("/hr/employee-form")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new EmployeeDto());
        return "b2/employee-form";
    }
    
    @GetMapping("/hr/success")
    public String showSuccess() {
        return "b2/success";
    }
    
    @PostMapping("/hr/add-employee")
    public String saveEmployee(
            @Valid @ModelAttribute("employee") EmployeeDto employee,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "b2/employee-form";
        }
        return "redirect:/hr/success";
    }
}
