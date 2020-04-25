package com.hibernet.demo.dao;

import java.util.List;

import com.hibernet.demo.model.User;

public interface UserDao {
	public void addUser(User user);

	public User findById(Long id);

	public List<User> getUser();

	public User update(User user, Long id);

	public void delete(Long id);
//	public User updateCountry(User user, int id);
}
