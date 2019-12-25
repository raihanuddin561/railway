package com.spring.railway.dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public class ImageDaoImpl implements ImageDao {

	@Override
	public String uploadFile(MultipartFile file) {
		// TODO Auto-generated method stub
		String name= "";
		if(!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				String rootPath = "C:\\Users\\User\\Pictures\\webpic\\";
				File dir = new File( rootPath+File.separator+"locationimages");
				if(!dir.exists()) {
					dir.mkdirs();
				}
				 name = String.valueOf(new Date().getTime()+".jpg");
				File serverFile = new File(dir.getAbsolutePath()+File.separator+name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				return name;
			}catch(Exception ex) {
				
			}
		}else {
			
		}
		return name;
	}

}
