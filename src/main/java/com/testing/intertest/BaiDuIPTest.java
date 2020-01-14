package com.testing.intertest;

import com.testing.logger.AutoLogger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * 百度IP测试类，学习HTTPclient收发包
 * @author wong
 * @date 2019-10-13
 */
public class BaiDuIPTest {
    public static void main(String[] args) {
        //创建一个默认的httpclient用于收发包
        HttpClient client = HttpClients.custom().build();
        //创建httpget方法，将http方法和URL制定好，同时请求参数在URL中已经完成拼接
        HttpGet ipGet = new HttpGet("https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?query=1.1.1.1&co=&resource_id=6006&t=1561122902157&ie=utf8&oe=gbk&cb=op_aladdin_callback&format=json&tn=baidu&cb=jQuery11020678454937849067_1561122302674&_=1561122302706");
        try {
            //发包并且获取返回
            HttpResponse ipRes = client.execute(ipGet);
//            System.out.println("Response:"+ipRes);
            AutoLogger.log.info("Response:" + ipRes);
            //解析返回的主体内容
            HttpEntity ipEntity = ipRes.getEntity();
//            System.out.println("ipEntity:"+ipEntity);
            AutoLogger.log.info("ipEntity:" + ipEntity);
            String ipResult = EntityUtils.toString(ipEntity);
//            System.out.println("ipResult:"+ipResult);
            AutoLogger.log.info("ipResult:" + ipResult);
            //
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
