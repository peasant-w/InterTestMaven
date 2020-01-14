package com.testing.intertest;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.UnsupportedEncodingException;

public class PostJsonTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //创建一个httpclient用于收发包
        HttpClient client = HttpClients.createDefault();
        //创建httppost方法
        HttpPost jsonPost = new HttpPost("http://api.test.zhulogic.com/designer_api/account/login_quick");
        //设置请求头域信息
        jsonPost.setHeader("Content-Type","application/json;charset=UTF-8");
        jsonPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.90 Safari/537.36");
        StringEntity jsonParam = new StringEntity("{\"phone\":13408041298,\"code\":\"123\",}");
    }
}