package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;



@RestController
public class UserController 
{
	@Autowired
	UserService userService;
	
	@Operation(summary  = "create new User")
	@ApiResponse(responseCode = "201",description = "created user successfully")
	@PostMapping("/saveObj")
	public User saveUser(@RequestBody User user)
	{
		System.out.println("just checking");
		return userService.create(user);	
	}

	
	
	
//	@Operation(summary = "delete all users")
//	@ApiResponses(value= {
//			@ApiResponse(responseCode = "200",description = "All users deleted successfully"),
//			@ApiResponse(responseCode = "404",description = "Users not found to delete")
//	})
	
	
	
	
	//return new ResponseEntity<User>(userRepo.save(user),HttpStatus.CREATED);
	
	

}
