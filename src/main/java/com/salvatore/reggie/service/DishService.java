package com.salvatore.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.salvatore.reggie.dto.DishDto;
import com.salvatore.reggie.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    // 新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    // 根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    // 更新菜品信息，同时更新菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void updateWithFlavor(DishDto dishDto);

    // 删除菜品，同时需要删除套餐对应的口味数据
    public void removeWithFlavor(List<Long> ids);
}
