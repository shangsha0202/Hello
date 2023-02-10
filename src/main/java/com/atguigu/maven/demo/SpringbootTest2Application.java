package com.atguigu.maven.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.maven.bean.Person;

@Controller
@SpringBootApplication
public class SpringbootTest2Application {

	 
		public static void main(String[] args) {
			SpringApplication.run(SpringbootTest2Application.class, args);
		}
		@RequestMapping("/")
		public String index() {
			
			return "index";
		}
		
		@RequestMapping("userLogin")
		public String userLogin(Model model) {
			Person p=new Person("yxc",20);
			model.addAttribute("user", p);
			return "userLogin";
		}
	

}
