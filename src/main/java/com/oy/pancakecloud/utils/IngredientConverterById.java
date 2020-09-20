package com.oy.pancakecloud.utils;


import com.oy.pancakecloud.dao.IngredientRepository;
import com.oy.pancakecloud.entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientConverterById implements Converter<String,Ingredient> {
    private IngredientRepository ingredientRepository;
    public IngredientConverterById(IngredientRepository ingredientRepository){
        this.ingredientRepository=ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id);
    }

}
