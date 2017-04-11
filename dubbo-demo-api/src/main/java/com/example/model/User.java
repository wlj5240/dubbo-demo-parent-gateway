package com.example.model;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;



/**
 * Created on 2017/4/11 15:49.
 *
 * id 	BIGINT 	19 	 
 * username 	VARCHAR 	255 	用户名 
 * password 	VARCHAR 	255 	密码 
 * address 	VARCHAR 	255 	地址 
 * createdTime 	TIMESTAMP 	19 	创建时间 
 * desc 	INTEGER 	10 	 
 */

public class User implements Serializable {

	private static final long serialVersionUID = 3826838176926648421L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;


    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
		return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username == null ? null : username.trim();
		return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password == null ? null : password.trim();
		return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address == null ? null : address.trim();
		return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public User setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
		return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
