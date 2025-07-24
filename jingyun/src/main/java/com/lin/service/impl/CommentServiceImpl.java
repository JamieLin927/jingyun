package com.lin.service.impl;

import com.lin.entity.Comment;
import com.lin.mapper.CommentMapper;
import com.lin.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
