package com.maple.compy.controller;


import entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import util.MongondbClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
    @RequestMapping("/upload")
    @ResponseBody
    public Result upload(MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        try {
            String url = "/download/";
            MongondbClient mongondbClient = new MongondbClient();
            String mongodbId = mongondbClient.save(file.getBytes(), "Remark");
            url = url+"/"+mongodbId+"/"+extName+".do";
            return new Result(true,url);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "上传失败");
        }
    }
    @RequestMapping(value = "/download/{mongodbId}/{extName}")
    public void downLoad(HttpServletRequest request, HttpServletResponse response,@PathVariable String mongodbId,@PathVariable String extName) throws IOException {
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

