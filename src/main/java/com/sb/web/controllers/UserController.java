package com.sb.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.web.models.UserDTO;

@RestController
public class UserController {

	@GetMapping("/view-products")
	public List<UserDTO> viewProducts() {
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		
		UserDTO userDTO = new UserDTO(2,"Nga","s","s","");
		
		List<UserDTO> userDTOs1 = new ArrayList<UserDTO>();
		userDTOs1.add(new UserDTO(1,"Vinh","the","s","a"));
		userDTOs1.add(userDTO);
		userDTOs1.add(new UserDTO(3,"Quang","a","d","")); 
		
		userDTOs.addAll(userDTOs1);
		return userDTOs;
	}
}
