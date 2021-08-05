package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.User;
import com.nnk.springboot.repositories.TradeRepository;
import com.nnk.springboot.repositories.UserRepository;

@Service
public class UserService implements IUserService {

	
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	@Override
	public List<User> findAllUsersList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
	}
	@Override
	public Optional<User> findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
