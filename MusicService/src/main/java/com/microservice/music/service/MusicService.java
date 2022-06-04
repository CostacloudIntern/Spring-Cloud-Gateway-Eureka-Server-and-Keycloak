package com.microservice.music.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservice.music.entity.Music;
import com.microservice.music.repository.MusicRepository;

@Service
@Transactional
public class MusicService {

	
	@Autowired
	private MusicRepository musicRepository;
	
	public Music createMusic(Music music) {
		return musicRepository.save(music);
	}

	public Music getMusicById(long musicId) {
		
		Optional<Music> musicDb = this.musicRepository.findById(musicId);
			return musicDb.get();
	}
}