package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Gallery;


public interface GalleryDao {

	List<Gallery> getProfilePics(String username);

	void addGallery(Gallery gallery);

}
