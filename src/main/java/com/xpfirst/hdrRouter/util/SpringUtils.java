/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 * @className:com.xuexin.evaluation.util.SpringUtils
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-6-25      李大鹏                        v1.0.0        create
 *
 */
package com.xpfirst.hdrRouter.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;

@Component
public final class SpringUtils extends ApplicationObjectSupport {
    private static ApplicationContext applicationContext = null;

    @Override
    protected void initApplicationContext(ApplicationContext context)
            throws BeansException {
        // TODO Auto-generated method stub
        super.initApplicationContext(context);
        if (SpringUtils.applicationContext == null) {
            SpringUtils.applicationContext = context;
        }
    }

    public static ApplicationContext getAppContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return getAppContext().getBean(name);
    }
}