package com.salvatore.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salvatore.reggie.entity.DishFlavor;
import com.salvatore.reggie.mapper.DishFlavorMapper;
import com.salvatore.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
