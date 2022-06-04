package com.microservice.music.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "MusicDB")
public class Music {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long musicId;
	private String musicTitle;
	private String musicArtist;
	private String musicGenre;
	private double musiclength;
	private String uploadDate;
	private String uploadTime;
	
	public Music() {
		
	}
	public Music(long musicId, String musicTitle, String musicArtist, String musicGenre, double musiclength,
			String uploadDate, String uploadTime) {
		super();
		this.musicId = musicId;
		this.musicTitle = musicTitle;
		this.musicArtist = musicArtist;
		this.musicGenre = musicGenre;
		this.musiclength = musiclength;
		this.uploadDate = uploadDate;
		this.uploadTime = uploadTime;
	}
	
	public long getMusicId() {
		return musicId;
	}
	public void setMusicId(long musicId) {
		this.musicId = musicId;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getMusicArtist() {
		return musicArtist;
	}
	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}
	public String getMusicGenre() {
		return musicGenre;
	}
	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	public double getMusiclength() {
		return musiclength;
	}
	public void setMusiclength(double musiclength) {
		this.musiclength = musiclength;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	
	@Override
	public String toString() {
		return "Music [musicId=" + musicId + ", musicTitle=" + musicTitle + ", musicArtist=" + musicArtist
				+ ", musicGenre=" + musicGenre + ", musiclength=" + musiclength + ", uploadDate=" + uploadDate
				+ ", uploadTime=" + uploadTime + "]";
	}
}