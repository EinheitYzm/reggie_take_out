package com.salvatore.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.salvatore.reggie.entity.Orders;
import com.salvatore.reggie.mapper.OrdersMapper;

public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
