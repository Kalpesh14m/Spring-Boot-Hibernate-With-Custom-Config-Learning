package com.hibernet.demo.service;

import java.util.List;

import com.hibernet.demo.model.User;
import com.hibernet.demo.model.dto.RegistrationDTO;

public interface UserService {
	public void createUser(RegistrationDTO user);

	public User findById(Long id);

	public List<User> getUser();

	public User update(User user, Long id);

	public void deleteUserById(Long id);
//    public User updatePartially(User user, int id);
//    
}
