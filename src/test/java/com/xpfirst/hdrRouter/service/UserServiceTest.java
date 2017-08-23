package com.xpfirst.hdrRouter.service;

import com.xpfirst.hdrRouter.util.BaseSpringTestCase;
import com.xpfirst.hdrRouter.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright (C) 2017/5/11 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/11     kyq                       v1.0.0        create
 */
public class UserServiceTest extends BaseSpringTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void findUserByUsername(){
        User user = userService.findUserByUsername("100011");
        Assert.assertNotNull(user);
    }
}
