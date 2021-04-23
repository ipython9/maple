package util.mongodbService.impl;

import util.mongodbService.UploadService;

import java.io.File;

/**
 * @author hanyu
 * @version 1.0
 * @description todo
 * @date 2021/4/23
 */
public class UploadServiceImpl implements UploadService {

    @Override
    public String save(File file, String remark) {
        return null;
    }

    @Override
    public byte[] read(String id) {
        return new byte[0];
    }

    @Override
    public String save(byte[] bytes, String remark) {
        return null;
    }
}
