package com.oy.pancakecloud.pancake;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Orders {
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "id is required")
    private String id;
    @NotBlank(message = "street address is required")
    private String street;
    @NotBlank(message = "请输入城市")
    private String city;
    @NotBlank(message = "status is requirec")
    private String status;
    @NotBlank(message = "zip is required")
    private String zip;
    @CreditCardNumber(message = "please input valid credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message = "formatted must be MM/YY")
    private String ccExpiration;
    @Digits(integer = 3,fraction = 0,message = "invalid ccCVV")
    private String ccCVV;
}
