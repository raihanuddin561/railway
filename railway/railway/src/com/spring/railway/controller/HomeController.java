package com.spring.railway.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.spring.railway.dao.LocationDao;
import com.spring.railway.model.Gallery;
import com.spring.railway.model.Location;
import com.spring.railway.model.Users;
import com.spring.railway.service.GalleryService;
import com.spring.railway.service.UserService;
import com.spring.railway.utility.ImageUtility;
import com.spring.railway.utility.UserUtility;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	private LocationDao locations;
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private UserService userService;
	@Autowired
	private GalleryService galleryService;
	
	@RequestMapping("/")
	public String homePage(Model model,Principal principal) {
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);//getting user First name & profile pic
		}
		return "index";
	}
	
	@RequestMapping("/location")
	public String locationinfo(Model model,Principal principal) {
		List<Location> locationinfo = locations.getLocation();
		model.addAttribute("locationList", locationinfo);
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);//getting user First name & profile pic
		}
		return "locationinfo";
	}
	
	
	@RequestMapping("/addlocation")
	public String addLocationPage(Model model,@Valid Location location, BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("location",location);
			System.out.println("has errors");
			return "addlocation";
		}else {
			if(location.getLocation()!=null) {
				location.setPic(ImageUtility.uploadFile(location.getFile(),request,"locationimages",location.getLocation()));
				locations.addLocation(location);
				return "redirect:/location";
			}else {
				System.out.println("form loading");
				model.addAttribute("location",location);
				return "addlocation";
			}
		}
		
	}
	
	@RequestMapping("/service")
	public String servicePage(Principal principal,Model model) {
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);
		}
		return "services";
	}
	
	
	@RequestMapping("/profile")
	public String profilePage(Model model,@Valid Users user,@RequestParam("uid") String uid,BindingResult result,Principal principal) {
	
		
		if(result.hasErrors()) {
			model.addAttribute("user",user);
			System.out.println("has errors");
			
			String propic=userService.getProPic(uid);
			System.out.println(propic);
			model.addAttribute("propic",propic);
			
			return "profilepage";
		}else {
			if(user.getPropic()!=null) {
				if(user.getPropic().isEmpty()) {
					boolean uploadFileEmpty = true;
					model.addAttribute("uploadfileempty",uploadFileEmpty);
					return "redirect:/profile?uid="+uid;
				}
				
				
				user.setProfilePic(ImageUtility.uploadFile(user.getPropic(),request,"profile",user.getUsername()));
				userService.updateProfiler(user);
				if(!user.getProfilePic().equals("")) {
					Gallery gallery = new Gallery();
					gallery.setUsername(user.getUsername());
					gallery.setProfilePic(user.getProfilePic());
					galleryService.addGallery(gallery);
				}
				return "redirect:/";
			}else {
				System.out.println("form loading");
				model.addAttribute("user",user);
				
				model.addAttribute("username",uid);
				String propic=userService.getProPic(uid);
				System.out.println(propic);
				model.addAttribute("propic",propic);
				if(principal!=null) {
					UserUtility.getUserProfile(model,principal,userService);
				}
				
				return "profilepage";
			}
		}
		
		
		
	}
	
	
	@RequestMapping("/updatepropic")
	public String updatePropic(Model model,@Valid Users user,@RequestParam("username") String username) {
		
		return "redirect:/profile";
	}
	
	@RequestMapping("/gallery")
	public String getProfilepic(Model model,@RequestParam("uid")String username,Principal principal) {
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);
		}
		List<Gallery> profilePics= galleryService.getProfilePics(username);
		model.addAttribute("hasProfile",true);
		System.out.println("Profile: "+profilePics);
		model.addAttribute("pic",profilePics);
		
		return "gallery";
	}
	
	@RequestMapping("/userlist")
	public String searchPage(Model model,@RequestParam("firstname") String firstname,Principal principal) {
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);
		}
		List<Users> users = userService.getUserList(firstname);
		model.addAttribute("userlist",users);
		model.addAttribute("searchClicked",true);
		if(!users.isEmpty()) {
			boolean hasList = true;
			model.addAttribute("hasUserList",hasList);
		}
		return "search";
	}
	
	@RequestMapping("/search")
	public String searchPage(Model model,Principal principal) {
		if(principal!=null) {
			UserUtility.getUserProfile(model,principal,userService);
		}
		boolean hasList = false;
		model.addAttribute("hasUserList",hasList);
		return "search";
	}
	
}
