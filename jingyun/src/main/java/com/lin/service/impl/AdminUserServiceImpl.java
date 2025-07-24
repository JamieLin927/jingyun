package com.lin.service.impl;

import com.lin.entity.AdminUser;
import com.lin.mapper.AdminUserMapper;
import com.lin.service.IAdminUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户信息表 服务实现类
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements IAdminUserService {

}
