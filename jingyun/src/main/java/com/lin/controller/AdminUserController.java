package com.lin.controller;


import com.lin.entity.AdminUser;
import com.lin.mapper.AdminUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台用户信息表 前端控制器
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@RestController
@RequestMapping("/admin-user")
public class AdminUserController {

    @Autowired
    private  AdminUserMapper adminUserMapper;


    @RequestMapping("/getall")
    public List<AdminUser> getall(){
      List<AdminUser> list=  adminUserMapper.selectList(null);

        return list;
    };









}
