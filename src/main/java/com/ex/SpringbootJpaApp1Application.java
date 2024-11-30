package com.ex;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ex.entity.User;
import com.ex.repository.UserRepo;

@SpringBootApplication
public class SpringbootJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootJpaApp1Application.class, args);
		UserRepo repo = run.getBean(UserRepo.class);
		
		User u1 = new User(101,"AA", 22,"India" );
		User u2 = new User(102,"BB", 29,"India" );
		User u3 = new User(103,"CC", 21,"India" );
		User u4 = new User(104,"DD", 25,"India" );
		
		//repo.saveAll(Arrays.asList(u1,u2,u3,u4));
		//List<User> all = repo.findAll(Sort.by("age").descending());
		//List<User> all = repo.findAll(Sort.by("age").ascending());
		//all.forEach(user->{System.out.println(user);});
		PageRequest pg = PageRequest.of(0, 3);
		
		Page<User> all = repo.findAll(pg);
		List<User> content = all.getContent();
		content.forEach(user->{System.out.println(user);});
	}

}
