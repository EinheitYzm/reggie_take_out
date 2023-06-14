package com.salvatore.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salvatore.reggie.entity.Employee;
import com.salvatore.reggie.mapper.EmployeeMapper;
import com.salvatore.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
