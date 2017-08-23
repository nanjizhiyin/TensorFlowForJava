package com.xpfirst.hdrRouter;

import com.xpfirst.hdrRouter.PF.Vote;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/8/23 上午10:14
 **/
public class TEST {
    private static final Logger log = LoggerFactory.getLogger(TEST.class);

    @Test
    //发送验证码,接口有bug,获取验证码,并不需要使用
    public void getCode() {


        String url = "http://localhost:8034/nunjucks/list";


        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("Host", "www.cnblogs.com");
            CloseableHttpResponse response = httpclient.execute(httpGet);


            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);

        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }

    @Test
    public void makeMM(){

    }
}
