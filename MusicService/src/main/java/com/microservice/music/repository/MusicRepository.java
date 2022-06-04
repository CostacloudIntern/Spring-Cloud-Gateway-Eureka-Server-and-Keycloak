package com.microservice.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.music.entity.Music;


public interface MusicRepository extends MongoRepository<Music, Long>{

}