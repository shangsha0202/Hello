package com.atguigu.maven.bean;

public class Person {
	private String name;
    private Integer age;
    public Person() {
    	super();
    }
    public Person(String name,Integer age) {
    	super();
    	this.name=name;
    	this.age=age;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
//载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/weixin_40550726/article/details/80675911
}
