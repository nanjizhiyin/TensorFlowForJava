package com.xpfirst.hdrRouter.service;

import com.xpfirst.hdrRouter.entity.User;

/**
 * Copyright (C) 2017/5/10 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/10     kyq                       v1.0.0        create
 */
public interface UserService {

    /**
     * 根据学信ID查询用户信息
     * @author kyq
     * @version 1.0
     * @date 2017/5/10 18:59
     */
    public User findUserByUsername(String username);

}
