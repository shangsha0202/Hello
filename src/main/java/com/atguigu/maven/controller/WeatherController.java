package com.atguigu.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WeatherController {
	@RequestMapping("weather")
	public String weather(Model model) {
//		Person p=new Person("yxc",20);
		String city="东京";
		model.addAttribute("city", city);
		String weahter="晴";
		model.addAttribute("weather",weahter);
		return "weather";
	}

}
