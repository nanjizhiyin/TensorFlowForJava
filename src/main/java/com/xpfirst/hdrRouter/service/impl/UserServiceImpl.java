package com.xpfirst.hdrRouter.service.impl;

import com.xpfirst.hdrRouter.mapper.UserMapper;
import com.xpfirst.hdrRouter.service.UserService;
import com.xpfirst.hdrRouter.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright (C) 2017/5/10 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/10     kyq                       v1.0.0        create
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据学信ID查询用户信息
     * @author kyq
     * @version 1.0
     * @date 2017/5/10 18:59
     */
    public User findUserByUsername(String username){
        return userMapper.findUserByUsername(username);
    }
}
