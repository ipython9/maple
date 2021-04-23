package util.mongodbService;

import java.io.File;

/**
 * @author hanyu
 * @version 1.0
 * @description todo
 * @date 2021/4/23
 */
public interface UploadService {
    /**
     * 保存文件 返回mongodbID
     * @param file
     * @param remark
     * @return
     */
    String save(File file, String remark);

    /**
     * 读取文件
     * @param id
     * @return
     */
    byte[] read(String id);

    /**
     * 保存文件 返回mongodbID
     * @param bytes
     * @param remark
     * @return
     */
    String save(byte[] bytes, String remark);
}
