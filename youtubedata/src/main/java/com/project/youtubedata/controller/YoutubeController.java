package com.project.youtubedata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/youtuberss/api")
@RestController
public class YoutubeController {

  private final Logger logger = LoggerFactory.getLogger(YoutubeController.class);

  @RequestMapping("/{name}")
  public User getUserById(@RequestParam("name" String name)){

  }

}
