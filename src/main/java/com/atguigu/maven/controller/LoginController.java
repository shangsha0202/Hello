package com.atguigu.maven.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
@Controller：修饰class，用来创建处理http请求的对象
@RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
@RequestMapping：配置url映射
*/
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	/*
	 * @RequestMapping("/") public ModelAndView index(ModelMap map) {
	 * map.addAttribute("host", "https://tianle.me"); return new
	 * ModelAndView("index"); }
	 */

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest req) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("qinya") && password.equals("tianle")) {
            return "Success";
        } else {
            return "Failed";
        }
    }

}
