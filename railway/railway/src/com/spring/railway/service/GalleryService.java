package com.spring.railway.service;

import java.util.List;

import com.spring.railway.model.Gallery;


public interface GalleryService {

	List<Gallery> getProfilePics(String username);

	void addGallery(Gallery gallery);
	

}
