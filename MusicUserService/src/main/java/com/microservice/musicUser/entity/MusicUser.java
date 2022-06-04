package com.microservice.musicUser.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "MusicUserDB")
public class MusicUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long musicUserId;
	private String musicUserName;
	private Long musicId;
	
	public MusicUser() {
		
	}

	public MusicUser(Long musicUserId, String musicUserName, Long musicId) {
		super();
		this.musicUserId = musicUserId;
		this.musicUserName = musicUserName;
		this.musicId = musicId;
	}

	public long getMusicUserId() {
		return musicUserId;
	}

	public void setMusicUserId(Long musicUserId) {
		this.musicUserId = musicUserId;
	}

	public String getMusicUserName() {
		return musicUserName;
	}

	public void setMusicUserName(String musicUserName) {
		this.musicUserName = musicUserName;
	}

	public Long getMusicId() {
		return musicId;
	}

	public void setMusicrId(Long musicId) {
		this.musicId = musicId;
	}

	@Override
	public String toString() {
		return "User [userId=" + musicUserId + ", musicUserName=" + musicUserName + ", musicId=" + musicId + "]";
	}
}