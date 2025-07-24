package com.lin.controller;

import com.lin.entity.SysUser;
import com.lin.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @author :lzm
 * @date :2025/7/7 14:00
 * @description :
 * @modyified By:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/user")
    public List<SysUser> getuser(){


        return sysUserMapper.selectList(null);
    }
}
