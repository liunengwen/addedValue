package com.newland.starpos.addedvalue.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
        sqlSessionFactoryBean.setTypeAliasesPackage("com.newland.starpos.entity.*");

        // 设置mapper.xml文件路径
        Resource[] mapperLocation = resolver.getResources("classpath:mybatis/mapper/*.xml");

        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
        sqlSessionFactoryBean.setMapperLocations(mapperLocation);
        log.info("sqlSessionFactory初始化完成...");
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.newland.starpos.mapper");
        return mapperScannerConfigurer;
    }
}
