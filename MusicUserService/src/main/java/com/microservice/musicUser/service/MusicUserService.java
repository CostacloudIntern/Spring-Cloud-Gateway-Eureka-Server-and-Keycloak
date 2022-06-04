package com.microservice.musicUser.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.microservice.musicUser.VO.Music;
import com.microservice.musicUser.VO.ResponseTemplateVO;
import com.microservice.musicUser.entity.MusicUser;
import com.microservice.musicUser.repository.MusicUserRepository;

@Service
@Transactional
public class MusicUserService {

	@Autowired
	private MusicUserRepository musicUserRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public MusicUser createMusic(MusicUser musicUser) {
		return musicUserRepository.save(musicUser);
	}

	public MusicUser getMusicUserById(long musicUserId) {
		
		Optional<MusicUser> musicUserDb = this.musicUserRepository.findById(musicUserId);
			return musicUserDb.get();
	}

	public ResponseTemplateVO getUserWithMusic(Long musicUserId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		MusicUser musicUser = musicUserRepository.findByMusicUserId(musicUserId);
		Music music = restTemplate.getForObject("http://MUSIC-SERVICE/music/" + musicUser.getMusicId(), Music.class);
		
		vo.setMusicUser(musicUser);
		vo.setMusic(music);
		return vo;
	}
}
