package com.lin;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lin.entity.Tag;
import com.lin.mapper.TagMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class JingyunApplicationTests {

    @Autowired
    private TagMapper tagMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void  testjwt(){
        Map<String,Object> claims=new HashMap<>();
        claims.put("role","admin");

        long expired=1000*60*60;

        String key="linzm";

      String token=  Jwts.builder()
             .setHeaderParam("typ", "JWT")

                .setClaims(claims)
              .setSubject("jimmy")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+expired)).signWith(SignatureAlgorithm.HS256, key)
                .compact();
        System.out.println(token);


    }

    @Test
    void inserttag(){
       for (int i = 0; i <100 ; i++) {
        Tag tag=new Tag();
        tag.setName("标签名"+i);
        tag.setArticleCount(i);
        tag.setDescription("描述"+i);
        tag.setSlug("URL友好名称"+i);
        tagMapper.insert(tag);
    }

}
    @Test
    void selectpage(){
        Page<Tag> page=new Page<>();
        page.setCurrent(2);
        page.setSize(10);
        Page<Tag> page1 = tagMapper.selectPage(page, null);
        List<Tag> list = page1.getRecords();
        System.out.println(list);
    }


}
