package com.ex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_login")
public class User {
	@Id
	@Column(name = "user_Id")
	private Integer Userid;
	@Column(name = "user_Name")
	private String Username;
	@Column(name = "user_Age")
	private Integer age;
	@Column(name = "country")
	private String Country;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer userid, String username, Integer age, String country) {

		Userid = userid;
		Username = username;
		this.age = age;
		Country = country;
	}

	public Integer getUserid() {
		return Userid;
	}

	public void setUserid(Integer userid) {
		Userid = userid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", Username=" + Username + ", age=" + age + ", Country=" + Country + "]";
	}

}
