package com.microservice.musicUser.VO;

import com.microservice.musicUser.entity.MusicUser;

public class ResponseTemplateVO {

	private MusicUser musicUser;
	private Music music;
	
	public ResponseTemplateVO() {
		
	}
	
	public ResponseTemplateVO(MusicUser musicUser, Music music) {
		super();
		this.musicUser = musicUser;
		this.music = music;
	}

	public MusicUser getMusicUser() {
		return musicUser;
	}

	public void setMusicUser(MusicUser musicUser) {
		this.musicUser = musicUser;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVO [musicUser=" + musicUser + ", music=" + music + "]";
	}
}
