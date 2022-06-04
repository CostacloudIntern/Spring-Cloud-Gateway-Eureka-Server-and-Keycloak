package com.microservice.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.music.entity.Music;
import com.microservice.music.service.MusicService;

@RestController
public class MusicController {
	
	@Autowired
	private MusicService musicService;
		
	@GetMapping("/music/{id}")
	public Music getMusicById(@PathVariable long id){
		return (musicService.getMusicById(id));
	}
		
	@PostMapping("/music")
	public Music createMusic(@RequestBody Music music){
		return (this.musicService.createMusic(music));
	}
}