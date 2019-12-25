package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Authorities;
import com.spring.railway.model.Users;


public interface UserDao {
	public void addUser(Users user);
	public List<Users> userList();
	public void addAuthority(Authorities authority);
	public String getProPic(String uid);
	public void updateProfile(Users user);
	public String getFirstName(String name);
	public List<Users> getProfilePics(String username);
	public List<Users> getUserList(String firstname);
}
