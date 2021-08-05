package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.User;


public interface IUserService {

	User save(User user);

	List<User> findAllUsersList();

	void delete(User user);

	Optional<User> findUserById(Integer id);

}
