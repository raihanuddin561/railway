package com.spring.railway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="gallery")
@Table(name="gallery")
public class Gallery {
	@Id
	@Column(name="pid")
	private int pid;
	@Column(name="username")
	private String username;
	
	@Column(name="profile_pic")
	private String profilePic;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "Gallery [pid=" + pid + ", username=" + username + ", profilePic=" + profilePic + "]";
	}
	
	

}
