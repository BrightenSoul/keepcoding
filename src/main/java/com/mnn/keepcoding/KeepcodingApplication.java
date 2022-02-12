package com.mnn.keepcoding;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

/**
 * 启动配置文件
 * 2022年2月2日 17:48:48
 */
@SpringBootApplication
//    @SpringBootConfiguration
//    @EnableAutoConfiguration
//    @ComponentScan
@MapperScan(
        //指定扫描包，加载 MyBatis 的 Mapper
        basePackages = "com.mnn.keepcoding.*",
        //指定SqlSessionFactory，如果sqlSessionTemplate被指定，则作废
        sqlSessionFactoryRef = "sqlSessionFactory",
        //指定sqlSessionTemplate，将忽略sqlSessionFactory的配置
        sqlSessionTemplateRef = "sqlSessionTemplate",
        //markerInterface = Class.class,//限定扫描接口，不常用
        annotationClass = Repository.class
)
public class KeepcodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeepcodingApplication.class, args);
    }

}
