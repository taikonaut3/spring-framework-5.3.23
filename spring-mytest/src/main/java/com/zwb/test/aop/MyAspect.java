package com.zwb.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面测试
 *
 * @Author WenBo Zhou
 * @Date 2023/1/28 16:21
 */
@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(* com.zwb..*.hello(..))")
	private void pointcut(){}

	@Before("pointcut()")
	public void before(){
		System.out.println("before....");
	}
}
