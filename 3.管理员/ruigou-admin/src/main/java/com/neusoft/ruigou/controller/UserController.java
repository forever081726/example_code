package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.User;
import com.neusoft.ruigou.service.IUserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/listAllGoods")
	public List<User> listAllGoods(){
		return userService.listAllGoods();
	} 
	@RequestMapping("/search")
	public List<User> searchUser(@RequestBody User user){
		return userService.searchUser(user.getUserName(),user.getUserId());
	} 
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Integer userId) {
	userService.deleteUser(userId); 
	return ResponseEntity.noContent().build(); 
	}
}
