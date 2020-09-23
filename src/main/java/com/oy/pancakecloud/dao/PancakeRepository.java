package com.oy.pancakecloud.dao;

import com.oy.pancakecloud.entity.Pancake;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface PancakeRepository extends CrudRepository<Pancake,Long>{

}
