package com.atguigu.maven;
import org.junit.Test;


public class Test2 {
	
	@Test
	public void testHello() {
		
		 Hello hello =new Hello();
		 String maven = hello.sayHello("Maven");
		System.out.println(maven);
	
	}

}
