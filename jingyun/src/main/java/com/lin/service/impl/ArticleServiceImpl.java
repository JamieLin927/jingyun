package com.lin.service.impl;

import com.lin.entity.Article;
import com.lin.mapper.ArticleMapper;
import com.lin.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
