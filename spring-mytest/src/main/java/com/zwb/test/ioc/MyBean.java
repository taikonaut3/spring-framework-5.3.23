package com.zwb.test.ioc;

/**
 * @author zwb
 * @since 2022-10-26 16:19
 */
public class MyBean {

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	public void hello(){
		System.out.println("hello world");
	}
}
