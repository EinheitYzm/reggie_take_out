package com.salvatore.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salvatore.reggie.entity.OrderDetail;
import com.salvatore.reggie.mapper.OrderDetailMapper;
import com.salvatore.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
