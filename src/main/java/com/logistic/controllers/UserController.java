package com.logistic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.logistic.models.User;
import com.logistic.repository.UserRepositoryDefault;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserRepositoryDefault userRepository;

	@PostMapping
	public ResponseEntity<Void> create(@RequestBody User user, UriComponentsBuilder builder) {
        userRepository.create(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllArticles() {
		List<User> list = userRepository.findAll();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

}
