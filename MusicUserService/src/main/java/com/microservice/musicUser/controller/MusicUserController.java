package com.microservice.musicUser.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.musicUser.VO.ResponseTemplateVO;
import com.microservice.musicUser.entity.MusicUser;
import com.microservice.musicUser.service.MusicUserService;

@RestController
public class MusicUserController {
	
	@Autowired
	private MusicUserService musicUserService;
	
	@PostMapping("/musicUsers")
	@RolesAllowed("user")
	//User1: vibhooti	Password: vibhooti
	//User2: aditi		Password: aditi
	public MusicUser createUser(@RequestBody MusicUser musicUser){
		return (this.musicUserService.createMusic(musicUser));
	}
	
	@GetMapping("/musicUsers/{id}")            
	@RolesAllowed("admin")
	//Admin: vibhooti
	//Admin Password: vibhooti
	public ResponseTemplateVO getUserWithMusic(@PathVariable("id") Long musicUserId) {
		return musicUserService.getUserWithMusic(musicUserId);
	}
}
