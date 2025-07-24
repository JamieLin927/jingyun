package com.lin.service.impl;

import com.lin.entity.UserAuth;
import com.lin.mapper.UserAuthMapper;
import com.lin.service.IUserAuthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 第三方登录认证表 服务实现类
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Service
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth> implements IUserAuthService {

}
