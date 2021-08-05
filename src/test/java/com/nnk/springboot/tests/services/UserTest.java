package com.nnk.springboot.tests.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.User;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.repositories.UserRepository;
import com.nnk.springboot.services.IUserService;
import java.util.Optional;
import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;
import com.nnk.springboot.services.IRuleNameService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
@RunWith(SpringRunner.class)
@ComponentScan("com.nnk.springboot.tests.services")
@SpringBootTest

public class UserTest {

@Autowired
IUserService iUserService;
	@Test
	@Transactional
	public void userTest() {
		User user = new User(null, "Username Test", "Password1!", "Fullname Test", "ADMIN");

		// Save
		user = iUserService.save(user);
		Assert.assertNotNull(user.getId());

		// Update
		user.setFullname("FullnameTest2");
		user = iUserService.save(user);
		Assert.assertEquals(user.getFullname(), "FullnameTest2");

		// Find
		List<User> listResult = iUserService.findAllUsersList();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = user.getId();
		iUserService.delete(user);
		Optional<User> userList = iUserService.findUserById(id);
		Assert.assertFalse(userList.isPresent());
	}
}
