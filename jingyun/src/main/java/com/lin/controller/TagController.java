package com.lin.controller;


import com.lin.entity.Tag;
import com.lin.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 标签表 前端控制器
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagMapper tagMapper;

    @RequestMapping("/inserttag")
    public Integer inserttag(){
        for (int i = 0; i <100 ; i++) {
            Tag tag=new Tag();
            tag.setName("标签名"+i);
            tag.setArticleCount(i);
            tag.setDescription("描述"+i);
            tagMapper.insert(tag);
        }
        return 0;
    }
}
