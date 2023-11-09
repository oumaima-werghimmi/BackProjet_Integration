package projet.integration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projet.integration.entities.User;
import projet.integration.services.UserService;


@RestController
@CrossOrigin(origins=("*"))
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService UserService;
	
	@GetMapping
	List<User> all(){
		return UserService.findUser();
	}
	
	@PostMapping
	User newUser(@RequestBody User c) {
		return UserService.addUser(c);
	}

	@PutMapping("/{id}")
	User updateUser(@RequestBody User t, @PathVariable int id) {
		return  UserService.updateUser(t);
	}
	
	@DeleteMapping("/{id}")
	void deleteUser(@PathVariable int id) {
		UserService.deleteUser(id);
	}

	

}
