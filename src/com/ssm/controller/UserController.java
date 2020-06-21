package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list(ModelMap modelMap){
        List<User> list = userService.list();
        JSON json = new JSONArray();
        modelMap.put("list",list);
        for (User user : list) {
            System.out.println(user.toString());
        }
       return "index";
    }
}
