package com.oy.pancakecloud.pancake;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


import java.util.List;
@Data
public class Pancake {
    @NotNull
    @Size(min = 5 ,message = "name must be at least 5 characters long")
    private String name;
    @Size(min = 1,message = "至少要含一种配料")
    private List<String> ingredients;
}
