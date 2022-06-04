package com.microservice.musicUser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.musicUser.entity.MusicUser;


public interface MusicUserRepository extends MongoRepository<MusicUser, Long>{

	MusicUser findByMusicUserId(Long musicUserId);
}