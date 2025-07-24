package com.lin.service.impl;

import com.lin.entity.OperationLog;
import com.lin.mapper.OperationLogMapper;
import com.lin.service.IOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
