package com.oy.pancakecloud.dao;

import com.oy.pancakecloud.entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class IngredientRepositoryJDBCIm implements IngredientRepository{

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public IngredientRepositoryJDBCIm(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public Iterable<Ingredient> findAll() {
        return jdbcTemplate.query("select id,name,type from Ingredient",this::mapRowToIngredient);
    }

    @Override
    public Ingredient findById(String id) {
        return jdbcTemplate.queryForObject("select id,name ,type from Ingredient",this::mapRowToIngredient,id);
    }

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        return null;
    }

    private Ingredient mapRowToIngredient(ResultSet resultSet,int rowNumber) throws SQLException {
        return new Ingredient(
          resultSet.getString("id"),
          resultSet.getString("name"),
          Ingredient.Type.valueOf(resultSet.getString("type"))
        );
    }
}
