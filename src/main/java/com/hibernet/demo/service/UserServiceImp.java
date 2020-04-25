package com.hibernet.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernet.demo.config.WebSecurityConfig;
import com.hibernet.demo.dao.UserDao;
import com.hibernet.demo.model.User;
import com.hibernet.demo.model.dto.RegistrationDTO;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;

	@Autowired
	private WebSecurityConfig encrypt;

	@Override
	public void createUser(RegistrationDTO user) {
		userDao.addUser(new User(user.setPassword(encrypt.bCryptPasswordEncoder().encode(user.getPassword()))));
	}

	@Override
	public User findById(Long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> getUser() {
		return userDao.getUser();
	}

	@Override
	public void deleteUserById(Long id) {
		userDao.delete(id);
	}

	@Override
	public User update(User user, Long id) {
		return userDao.update(user, id);
	}

}
