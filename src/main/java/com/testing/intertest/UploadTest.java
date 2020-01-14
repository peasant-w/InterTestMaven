package com.testing.intertest;

import com.testing.logger.AutoLogger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传接口测试类
 * @author wong
 * @date 2019-10-13
 */
public class UploadTest {
    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClients.createDefault();
        //商城图片接口地址
        HttpPost upload = new HttpPost("http://www.testingedu.com.cn:8000/index.php/home/Uploadify/imageUp/savepath/head_pic/pictitle/banner/dir/images.html");
        //创建multipartEntityBuilder,用于完成完成请求的封装
        MultipartEntityBuilder mtpEn = MultipartEntityBuilder.create();
        //将每个请求的部分进行封装
        //创建一个文件
        File uploadFile = new File("./images/322809.jpg");
        mtpEn.addBinaryBody("file",uploadFile);
        mtpEn.addTextBody("id","WU_FILE_0");
        mtpEn.addTextBody("name","logo_500x500.png");
        //通过multipartbuilder创建出实体
        HttpEntity uploadEn = mtpEn.build();
        upload.setEntity(uploadEn);
        //执行请求，获取返回结果
        HttpResponse uploadRes = client.execute(upload);
        String uploadResult = EntityUtils.toString(uploadRes.getEntity());
        AutoLogger.log.info(uploadResult);
    }
}
