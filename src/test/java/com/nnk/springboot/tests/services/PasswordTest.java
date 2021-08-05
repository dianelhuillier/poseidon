package com.nnk.springboot.tests.services;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.Optional;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.domain.User;
import com.nnk.springboot.services.IUserService;

import junit.framework.Assert;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 09/03/2019
 * Time: 11:26 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordTest {
	
@Autowired
private IUserService iUserService;

    @Test
    public void testPasswordEncode() {
    	User user = new User(738, "username", "123", "fulltest", "ADMIN");
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        assertFalse(Pattern.matches(user.getPassword(), "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"));
        user.setPassword("Password1!");
        String pw = encoder.encode(user.getPassword());
        user.setPassword(pw);
        iUserService.save(user);
        System.out.println("[ "+ pw + " ]");
        assertEquals("password is encoded", user.getPassword(), pw);

    }
}
