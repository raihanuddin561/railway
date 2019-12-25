package com.spring.railway.dao;

import org.springframework.web.multipart.MultipartFile;

public interface ImageDao {
	public String uploadFile(MultipartFile file);
}
