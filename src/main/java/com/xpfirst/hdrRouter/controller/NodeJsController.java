package com.xpfirst.hdrRouter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C) 北京学信科技有限公司
 * nodejs官网 https://nodejs.org/en/
 * @Des: 验证nodejs的使用方法
 * @Author: gaojindan
 * @Create: 2017/5/19 17:11
 **/
@Controller
@RequestMapping(value = "nodejs")
public class NodeJsController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value="param")
    @ResponseBody
    public String param(ModelMap modelMap,
                        @RequestParam(value = "param") String param,
                        @RequestParam(value = "paramValue") String paramValue
    ){
        return "param is:" + param + "paramValue: " + paramValue;
    }
    @RequestMapping(value="param1")
    @ResponseBody
    public String param1(ModelMap modelMap,
                               @RequestBody String paramValue
    ){
        return "body is:" + paramValue;
    }
}
