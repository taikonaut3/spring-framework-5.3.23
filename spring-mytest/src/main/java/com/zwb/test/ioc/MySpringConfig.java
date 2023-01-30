package com.zwb.test.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zwb
 * @since 2022-10-26 16:15
 */
@Configuration
@ComponentScan("com.zwb")
@EnableAspectJAutoProxy
public class MySpringConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
