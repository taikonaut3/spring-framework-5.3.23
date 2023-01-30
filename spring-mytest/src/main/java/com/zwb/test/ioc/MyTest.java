package com.zwb.test.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zwb
 * @since 2022-10-26 16:15
 */
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.hello();
    }
}
