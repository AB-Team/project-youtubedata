package com.project.youtubedata.controller;

import com.project.youtubedata.model.Video;
import com.project.youtubedata.repository.YoutubeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/youtuberss/api")
@RestController
public class YoutubeController {

  private final Logger logger = LoggerFactory.getLogger(YoutubeController.class);

  @Autowired
  YoutubeRepository youtubeRepository;

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/all")
  public List<Video> getAllVideos(){

    List<Video> videos = youtubeRepository.findAll();

    return videos;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @RequestMapping("/{id}")
  public Video getVideoById(@PathVariable("id") String id){

    Optional videoOptional = youtubeRepository.findById(id);

    if(videoOptional.isPresent()){
      Video video = (Video) videoOptional.get();

      return video;
    }

    return new Video();
  }
}
