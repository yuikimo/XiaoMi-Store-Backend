package com.mall.xiaomi;

import com.mall.xiaomi.util.IdWorker;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.mall.xiaomi.mapper", annotationClass = Mapper.class)
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public IdWorker getIdWork() {
        return new IdWorker();
    }

    @Bean
    public Queue queue() {
        return new Queue("seckill_order",true);
    }

}
