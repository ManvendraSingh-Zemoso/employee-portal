package com.zemoso.demo.controller;

import com.zemoso.demo.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Class to wright rest api calls for image
 */
@Controller
public class ImageController {
    @Autowired
    private ImageUtil imageUtil;

    /**
     * Method to save image
     * @param multipartFile
     * @return
     */
    @RequestMapping(path = "/pictures",method = RequestMethod.POST)
    public ResponseEntity addImage(@RequestParam("picture[image]") MultipartFile multipartFile){
        String imagePath = imageUtil.saveImage(multipartFile);
        Long id = imageUtil.generateUniqueId();
        Map<String,Object> responseMap = new HashMap<>();
        responseMap.put("imagePath",imagePath);
        responseMap.put("id",id);
        Map<String,Map<String,Object>> response = new HashMap<>();
        response.put("picture",responseMap);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    /**
     * Method to get image
     * @param image
     * @param response
     * @throws Exception
     */
    @RequestMapping(path = "/{image}",method = RequestMethod.GET,produces = MediaType.IMAGE_JPEG_VALUE)
    public void getImage(@PathVariable String image, HttpServletResponse response) throws IOException {
        File imageFile = new File("/home/zemoso/employee-portal/new/employee-portal/images/"+image);
        try(InputStream inputStream = new FileInputStream(imageFile)){
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            StreamUtils.copy(inputStream,response.getOutputStream());
        }
    }
}
