package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String  password;
    @JsonProperty("usertype")
    private String usertype;
    @JsonProperty("age")
    private String age;
    @JsonProperty("active")
    private boolean active;

    public User() {
    }

    public User(String username, String password, String usertype, String age, boolean active) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.age = age;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
