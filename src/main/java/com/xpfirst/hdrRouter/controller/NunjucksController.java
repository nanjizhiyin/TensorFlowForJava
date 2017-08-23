package com.xpfirst.hdrRouter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/5/23 10:05
 **/
@Controller
@RequestMapping(value = "nunjucks")
public class NunjucksController {
    private static final Logger log = LoggerFactory.getLogger(NunjucksController.class);

    @RequestMapping(value = "list")
    public ModelAndView list(ModelMap modelMap, HttpServletRequest request){

        modelMap.put("paramValue","测试nunjucks");
        modelMap.put("getRequestURI",request.getRequestURI());
        modelMap.put("getQueryString",request.getQueryString());
        modelMap.put("getRemoteHost",request.getRemoteHost());
        modelMap.put("getRemoteAddr",request.getRemoteAddr());
        modelMap.put("getRemotePort",request.getRemotePort());

        Enumeration myEnumeration = request.getHeaderNames();
        //使用对象循环显示myDataStruct类型的对象中的每一个元素
        while (myEnumeration.hasMoreElements()){
            String tmpKey = myEnumeration.nextElement().toString();
            System.out.println(tmpKey + "=" +request.getHeader(tmpKey));
        }

        log.info("=============>"+modelMap.toString());
        return new ModelAndView("nunjucks/list");
    }
}
