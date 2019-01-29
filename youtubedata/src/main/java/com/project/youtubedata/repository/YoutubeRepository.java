package com.project.youtubedata.repository;

import com.project.youtubedata.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YoutubeRepository extends MongoRepository<User, String> {
}
