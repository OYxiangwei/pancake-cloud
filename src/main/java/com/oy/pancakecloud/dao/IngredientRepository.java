package com.oy.pancakecloud.dao;

import com.oy.pancakecloud.entity.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient  saveIngredient(Ingredient ingredient);
}
