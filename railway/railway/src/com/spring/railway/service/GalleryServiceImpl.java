package com.spring.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.GalleryDao;
import com.spring.railway.model.Gallery;

@Service
public class GalleryServiceImpl implements GalleryService {
	@Autowired
	private GalleryDao galleryDao;
	@Override
	public List<Gallery> getProfilePics(String username) {
		// TODO Auto-generated method stub
		return galleryDao.getProfilePics(username);
	}
	@Override
	public void addGallery(Gallery gallery) {
		// TODO Auto-generated method stub
		 galleryDao.addGallery(gallery);
		
	}

}
