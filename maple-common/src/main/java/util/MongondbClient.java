package util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSUploadOptions;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.io.*;

/**
 * @author hanyu
 * @version 1.0
 * @description 图片上传工具类
 * @date 2021/4/20
 */
public class MongondbClient {
    private static final String FILE_NAME = "filename";

    private final static String REMARK = "remark";
    public static String getFileType(String fileName) {
        String[] fileInfo = fileName.split("\\.");
        return fileInfo[1];
    }
    public String save(File file, String remark) {
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.92.128:27017");
        MongoDatabase database = mongoClient.getDatabase("imageCollection");
        GridFSBucket gridBucket = GridFSBuckets.create(database);
        String fileType =getFileType(file.getName());

        ObjectId fileId = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            GridFSUploadOptions uploadOptions = new GridFSUploadOptions().chunkSizeBytes(1024)
                    .metadata(new Document("type", fileType).append(REMARK, remark).append(FILE_NAME, file.getName()));
            fileId = gridBucket.uploadFromStream(file.getName(), inputStream, uploadOptions);
            return fileId.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        return null;
    }


    public byte[] read(String id) {
        MongoClient mongoClient = MongoClients.create("mongodb://host1");
        MongoDatabase database = mongoClient.getDatabase("imageCollection");
        GridFSBucket gridBucket = GridFSBuckets.create(database);
        GridFSDownloadStream stream = null;
        ByteArrayOutputStream output = null;
        try {
            stream = gridBucket.openDownloadStream(new ObjectId(id));
            output = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int n = 0;
            while (-1 != (n = stream.read(buffer))) {
                output.write(buffer, 0, n);
            }
            return output.toByteArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (null != output) {
                try {
                    output.close();
                } catch (IOException e) {
                }
            }
            if (null != stream) {
                stream.close();
            }
        }
        return null;
    }

    public String save(byte[] bytes, String remark) {
        MongoClient mongoClient = MongoClients.create("mongodb://host1");
        MongoDatabase database = mongoClient.getDatabase("imageCollection");
        GridFSBucket gridBucket = GridFSBuckets.create(database);
        ObjectId fileId = null;
        InputStream inputStream = null;
        try {
            inputStream = new ByteArrayInputStream(bytes);
            GridFSUploadOptions uploadOptions = new GridFSUploadOptions().chunkSizeBytes(1024)
                    .metadata(new Document("remark", remark));
            fileId = gridBucket.uploadFromStream("", inputStream, uploadOptions);
            return fileId.toString();
        } catch (Exception e) {
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\43530\\Desktop\\backgrouimage.jpg");
        MongondbClient mongondbClient = new MongondbClient();
        String remarke = mongondbClient.save(file, "remarke");
        System.out.println(remarke);
    }
}
