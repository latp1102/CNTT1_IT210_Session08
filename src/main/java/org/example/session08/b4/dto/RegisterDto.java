package org.example.session08.b4.dto;

import jakarta.validation.constraints.NotBlank;

public class RegisterDto {
    @NotBlank(message = "User ko đc để trống")
    private String username;
    @NotBlank(message = "Password ko đc để trống")
    private String password;
    @NotBlank(message = "Confirm Password ko đc để trống")
    private String confirmPassword;
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
}
