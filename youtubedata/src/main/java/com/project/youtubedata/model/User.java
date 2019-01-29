package com.project.youtubedata.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

  @Id
  private long _id;
  private String className;
  private int active;
  private String email;
  private Timestamp lastLogin;
  private String name;
  private String description;
  private String userId;
  private Timestamp pwdLastUpdate;
  private String crpwd;
  private String language;

  public User(long _id, String className, int active, String email, Timestamp lastLogin,
              String name, String description, String userId, Timestamp pwdLastUpdate,
              String crpwd, String language) {
    this._id = _id;
    this.className = className;
    this.active = active;
    this.email = email;
    this.lastLogin = lastLogin;
    this.name = name;
    this.description = description;
    this.userId = userId;
    this.pwdLastUpdate = pwdLastUpdate;
    this.crpwd = crpwd;
    this.language = language;
  }

  public User() {}

  public long get_id() {
    return _id;
  }

  public void set_id(long _id) {
    this._id = _id;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public int getActive() {
    return active;
  }

  public void setActive(int active) {
    this.active = active;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Timestamp getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Timestamp lastLogin) {
    this.lastLogin = lastLogin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Timestamp getPwdLastUpdate() {
    return pwdLastUpdate;
  }

  public void setPwdLastUpdate(Timestamp pwdLastUpdate) {
    this.pwdLastUpdate = pwdLastUpdate;
  }

  public String getCrpwd() {
    return crpwd;
  }

  public void setCrpwd(String crpwd) {
    this.crpwd = crpwd;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
