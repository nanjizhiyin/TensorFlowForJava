package com.xpfirst.hdrRouter.DownloadImage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des: 从手写识别数据库下载图片
 * @Author: Gaojindan
 * @Create: 2017/8/18 下午4:49
 **/
public class DownloadImage {
    private static final Logger log = LoggerFactory.getLogger(DownloadImage.class);

//    @Test
//    public void phoneFor(){
////        int phone = 1000;
////        for (int i = 0; i < 1000; i++){
////            getCode(phone+i);
////        }
//
//        getImage(1);
//    }
    @Test
    public void getImage()
    {

        String url = "http://hwr.imxuexin.cn/hdrRouter/group/imagesearch";
        List<NameValuePair> params = new ArrayList<NameValuePair>();

//        params.add(new BasicNameValuePair("searchField", "multiDigitID"));
//        params.add(new BasicNameValuePair("searchKey", String.valueOf(1)));

        params.add(new BasicNameValuePair("searchField", "templateID"));
        params.add(new BasicNameValuePair("searchKey", String.valueOf(29)));

        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost(url);
            httppost.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            CloseableHttpResponse response = httpclient.execute(httppost);
            //发送Post,并返回一个HttpResponse对象
            String resultStr = EntityUtils.toString(response.getEntity());
            log.info("================= > " + resultStr);


            JSONArray jArray = JSON.parseArray(resultStr);
            Iterator<Object> it = jArray.iterator();
            while (it.hasNext()) {
                JSONObject ob = (JSONObject) it.next();
                String imageURL = ob.getString("imageURL");
                String result = ob.getString("result");
                String templateID = ob.getString("templateID");

                //识别结果
                result = result.trim();
                if ( result == null || result.equals("") || result.length() < 2){
                    continue;
                }
                log.info("================= > 收到 imageURL " + imageURL);

                int startIndex = imageURL.lastIndexOf("/");
                // 获取文件名
                String fileName = imageURL.substring(startIndex+1);
                // 取文件名前的文件夹
                String folderName = imageURL.substring(startIndex-32,startIndex);

                download(imageURL, folderName+"-"+fileName,"/Users/xuexin/Pictures/HdrImage/"+templateID+"/"+result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }

    }

    /**
    * @Author: Gaojindan
    * @Create: 2017/8/18 下午5:49
    * @Des: 下载图片
    * @Param:
    * @Return:
    */
    public static void download(String urlString, String filename,String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为5s
        con.setConnectTimeout(5*1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"/"+filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }

}
