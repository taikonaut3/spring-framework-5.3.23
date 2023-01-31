package com.zwb.test.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 组件
 *
 * @Author WenBo Zhou
 * @Date 2023/1/19 16:22
 */
@Component
public class MyComponent {
	public String name="哈哈哈 ";

	@Autowired
	MyBean myBean;
}
