package com.lin.util;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


/**
 * @author :lzm
 * @date :2025/7/11 15:45
 * @description :
 * @modyified By:
 */
public class CodeGenerator {
    public static void main(String[] args) {
        AutoGenerator generator=new AutoGenerator();
        GlobalConfig globalConfig=new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("YourName"); // 作者名
        globalConfig.setOpen(false); // 生成后不打开文件夹
        globalConfig.setSwagger2(true); // 开启 Swagger 注解
        generator.setGlobalConfig(globalConfig);

        // 3. 数据源配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setUrl("jdbc:mysql://localhost:3306/blog?useSSL=false&serverTimezone=UTC");
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        generator.setDataSource(dataSource);

        // 4. 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.lin"); // 父包名
        //packageConfig.setModuleName("system"); // 模块名（可选）
        packageConfig.setEntity("entity"); // 实体类包名
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        generator.setPackageInfo(packageConfig);

        // 5. 策略配置（数据库表设置）
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel); // 表名转驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel); // 列名转驼峰
        strategy.setEntityLombokModel(true); // 使用 Lombok
        strategy.setRestControllerStyle(true); // RESTful 控制器
        //strategy.setInclude("user", "order"); // 要生成的表名（多个用逗号分隔）
        strategy.setControllerMappingHyphenStyle(true); // URL 中驼峰转连字符
        generator.setStrategy(strategy);
        // 添加这行配置使用 Freemarker
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        // 6. 执行生成
        generator.execute();
    }
}