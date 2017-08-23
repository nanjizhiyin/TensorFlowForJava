package com.xpfirst.hdrRouter.controller;


import com.xpfirst.hdrRouter.entity.User;
import com.xpfirst.hdrRouter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Copyright (C) 2017/5/10 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/10     kyq                       v1.0.0        create
 */

@Controller
@RequestMapping(value = "user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value="login")
    public ModelAndView login(@RequestParam(value = "username", required = true) String username,
                              ModelMap modelMap){
        User user = userService.findUserByUsername(username);
        modelMap.put("user", user);
        return new ModelAndView("index");
    }
}
