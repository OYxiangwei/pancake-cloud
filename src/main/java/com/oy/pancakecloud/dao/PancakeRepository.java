package com.oy.pancakecloud.dao;

import com.oy.pancakecloud.entity.Pancake;
import org.springframework.data.repository.CrudRepository;
public interface PancakeRepository extends CurdRepository<Pancake, Long>{
}
