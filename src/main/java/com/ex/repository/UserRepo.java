package com.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
