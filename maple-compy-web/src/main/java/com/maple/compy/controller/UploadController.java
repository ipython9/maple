package com.maple.user.controller;


import entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import util.MongondbClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@RestController
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
    @RequestMapping("/upload")
    public Result upload(MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        try {
            String url = "127.0.0.1:9103/open/";
            MongondbClient mongondbClient = new MongondbClient();
            String mongodbId = mongondbClient.save(file.getBytes(), "REmark");
            url = url+mongodbId+"/"+extName;
            return new Result(true,url);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "上传失败");
        }
    }
    @RequestMapping("/open/{mongodbId}/{ext}")
    public void upload(HttpServletRequest request, HttpServletResponse response, @PathVariable String mongodbId, @PathVariable String ext) throws IOException {
        OutputStream  os= null;
        try{
            MongondbClient mongondbClient = new MongondbClient();
            byte[] b = mongondbClient.read(mongodbId);

            os = response.getOutputStream();
            os.write(b);
        }catch (Exception e){
            logger.error("exception{}",e.getMessage());
        }finally {
            os.flush();
        }


    }
}

