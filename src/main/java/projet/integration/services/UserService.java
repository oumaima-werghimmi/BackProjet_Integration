package projet.integration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import projet.integration.entities.User;

import projet.integration.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository UserR;
	
	public User addUser(User t) {
		return UserR.save(t);
	}
	
	public List<User> findUser(){
		return UserR.findAll();
	}
	
	public User updateUser(User u) {
		return UserR.save(u);
	}
	
	public void deleteUser(int id) {
		UserR.deleteById(id);
	}
}
