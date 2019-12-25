package com.spring.railway.utility;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.multipart.MultipartFile;

public class ImageUtility {
	
	public static String uploadFile(MultipartFile file,HttpServletRequest request,String folderName, String username) {
		// TODO Auto-generated method stub
		
		String name= "";
		if(!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				String rootPath = request.getSession().getServletContext().getRealPath("/WEB-INF/resources/uploads/"+username+"/");
				System.out.println(rootPath);
				File dir = new File( rootPath+File.separator+folderName);
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
