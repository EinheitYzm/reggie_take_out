package com.salvatore.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salvatore.reggie.entity.User;
import com.salvatore.reggie.mapper.UserMapper;
import com.salvatore.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
