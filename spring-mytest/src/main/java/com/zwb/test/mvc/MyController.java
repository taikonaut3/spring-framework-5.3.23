package com.zwb.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author WenBo Zhou
 * @Date 2023/1/30 11:08
 */
@Controller
public class MyController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello world";
	}
}
