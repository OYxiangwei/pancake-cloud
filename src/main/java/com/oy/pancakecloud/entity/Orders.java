package com.oy.pancakecloud.entity;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Orders {
    private Date createAt;
    @NotBlank(message = "deliveryName is required")
    private String deliveryName;
    @NotBlank(message = "id is required")
    private long id;
    @NotBlank(message = "deliveryStreet address is required")
    private String deliveryStreet;
    @NotBlank(message = "请输入城市")
    private String deliveryCity;
    @NotBlank(message = "status is requirec")
    private String status;
    @NotBlank(message = "deliveryZip is required")
    private String deliveryZip;
    @CreditCardNumber(message = "please input valid credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message = "formatted must be MM/YY")
    private String ccExpiration;
    @Digits(integer = 3,fraction = 0,message = "invalid ccCVV")
    private String ccCVV;
    List<Pancake> pancakeList = new ArrayList<>();
    public void addDesign(Pancake design){
        this.pancakeList.add(design);
    }
}
