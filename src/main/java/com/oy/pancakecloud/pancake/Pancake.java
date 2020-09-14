package com.oy.pancakecloud.pancake;

import lombok.Data;

import java.util.List;
@Data
public class Pancake {
    private String name;
    private List<String> ingredients;
}
