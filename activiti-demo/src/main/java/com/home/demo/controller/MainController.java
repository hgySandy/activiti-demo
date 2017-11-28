package com.home.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author HenryYan
 */
@Controller
public class MainController {

    @RequestMapping(value = {"/"})
    public String login() {
        return "forward:/login.jsp";
    }
    
    @RequestMapping(value = {"/main/index"})
    public String index() {
    	return "/main/index";
    }

    @RequestMapping(value = "/main/welcome")
    public String welcome() {
        return "/main/welcome";
    }

}
