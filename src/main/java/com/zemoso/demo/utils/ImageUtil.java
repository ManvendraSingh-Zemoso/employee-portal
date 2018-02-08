package com.zemoso.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.UUID;

@Component
public class ImageUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImageUtil.class);
    /**
     * Method to get String UUID and save image
     * @param multipartFile
     * @return
     */
    public String saveImage(MultipartFile multipartFile){
        String uuid = UUID.randomUUID().toString();
        String imagePath = "/home/zemoso/employee-portal/new/employee-portal/images/";
        try{
            File imageFile = new File(imagePath+uuid);
            Files.copy(multipartFile.getInputStream(),imageFile.toPath());
        }catch (IOException e){
            LOGGER.error("image not found");
        }
        return uuid;
    }

    /**
     * Generate unique ID from UUID in positive space
     * @return long value representing UUID
     */
    public Long generateUniqueId()
    {
        long val = -1;
        do
        {
            final UUID uid = UUID.randomUUID();
            final ByteBuffer buffer = ByteBuffer.wrap(new byte[16]);
            buffer.putLong(uid.getLeastSignificantBits());
            buffer.putLong(uid.getMostSignificantBits());
            final BigInteger bi = new BigInteger(buffer.array());
            val = bi.longValue();
        } while (val < 0);
        return val;
    }
}
