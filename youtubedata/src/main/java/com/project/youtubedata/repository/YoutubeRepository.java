package com.project.youtubedata.repository;

import com.project.youtubedata.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YoutubeRepository extends MongoRepository<Video, String> {

    public Optional<Video> findByTitle(String title);
}
