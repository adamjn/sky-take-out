package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;



public interface DishService {
    /**
     * 新增菜品和口味
     *
     * @param dishDto
     */
    public void saveWithFlavor(DishDTO dishDto);
}
