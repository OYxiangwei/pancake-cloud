package com.oy.pancakecloud.pancake;

import lombok.Data;

@Data
public class Orders {
    private String name;
    private String id;
    private String street;
    private String city;
    private String status;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
