package com.nkk.springboot.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
//import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.domain.User;
import com.nnk.springboot.services.BidListService;
import com.nnk.springboot.services.IBidListService;
import com.nnk.springboot.services.IRuleNameService;
import com.nnk.springboot.services.RuleNameService;

import lombok.Getter;

//import com.nnk.springboot.config.AuthenticationMock;
//import com.nnk.springboot.config.AuthenticationMock.WithUserAuth;
import com.nnk.springboot.config.SpringWebUnitTestConfig;
//import com.nnk.springboot.testconfig.OAuthUtils;
import com.nnk.springboot.controllers.BidListController;
@SpringBootTest(classes = RuleName.class)
@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration
@AutoConfigureMockMvc
@AutoConfigureWebTestClient
public class RuleNameControllerTest {
//	Logger logger = LoggerFactory.getLogger(RuleNameControllerTest.class);
//
//	@Autowired
//	@Getter
//	private MockMvc mockMvc;

//@Autowired
//AuthenticationMock authenticationMock;
//	   @Autowired
//	    private WebApplicationContext wac;
//	   @Autowired
//	   IRuleNameService iRuleNameService;

//	
//	
//    @Autowired
//    private WebApplicationContext webContext;

//    @MockBean
//    RuleNameService ruleNameService;
	/*
	 * [ERROR]
	 * test_application(com.nkk.springboot.tests.controllers.RuleNameControllerTest)
	 * Time elapsed: 0 s <<< ERROR! java.lang.IllegalStateException: Failed to load
	 * ApplicationContext Caused by: org.mockito.exceptions.base.MockitoException:
	 * 
	 * Mockito cannot mock this class: class
	 * com.nnk.springboot.services.RuleNameService.
	 * 
	 * Mockito can only mock non-private & non-final classes.
	 */
//    @Before
//    public void setupMockmvc() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
//    }
	
	
//	
//	@Test
//	@WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//	public void test_applicationIsUp()  {
////		try {
////		User user = new User ();
//			try {
//				this.mockMvc.perform(get("ruleName/list"))
//				.andDo(print())
//				.andExpect(status().isNotFound());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
	
	@Test
	@WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
	public void test_application()  {
//		try {
//		User user = new User ();
			try {
				URL url = new URL("http://localhost:8080/ruleName/li");
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				 
				int responseCode = huc.getResponseCode();
				 
				Assert.assertEquals(HttpURLConnection.HTTP_OK, responseCode);
//				this.mockMvc.perform(get("/home"))
//				.andDo(print())
//				.andExpect(status().isNotFound());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
