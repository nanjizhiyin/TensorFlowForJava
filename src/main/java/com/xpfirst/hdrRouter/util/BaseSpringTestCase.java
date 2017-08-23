package com.xpfirst.hdrRouter.util;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@Transactional
public class BaseSpringTestCase extends TestCase{

}
