//package com.nkk.springboot.tests.controllers;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.never;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentCaptor;
//import org.mockito.MockitoAnnotations;
//import org.springframework.web.context.WebApplicationContext;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Import;
////import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.nnk.springboot.domain.BidList;
//import com.nnk.springboot.services.BidListService;
//import com.nnk.springboot.services.IBidListService;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import com.nnk.springboot.WebConfiguration;
//import com.nnk.springboot.config.SpringWebUnitTestConfig;
////import com.nnk.springboot.testconfig.OAuthUtils;
//import com.nnk.springboot.controllers.BidListController;
//
//
////@WebMvcTest tells Spring Boot to instantiate only the web layer and not the entire context
////@WebMvcTest(controllers = BidListController.class) 
////We create SpringSecurityWebTestConfig.class because @Service are not loaded by @WebMvcTest
////This way we create a UserDetailsService, a mock CustomOAuth2UserService and a mock ClientRegistrationRepository
////@Import(SpringWebUnitTestConfig.class)
////@SpringBootTest(classes = BidListController.class)
//@AutoConfigureMockMvc
//@WebAppConfiguration
//@ContextConfiguration(classes = WebConfiguration.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class BidListControllerTest {
//
//	Logger logger = LoggerFactory.getLogger(BidListControllerTest.class);
//	
//	
//
////		@Autowired
//		private MockMvc mockMvc;
//		
//	   @Autowired
//	     WebApplicationContext wac;
//	
//    @SuppressWarnings("deprecation")
//	@BeforeEach
//    public void setup(){
//    	MockitoAnnotations.initMocks(this);
//
//        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //Build MockMVC
//    }
//    
//    
//
//	
////	@MockBean
////	private IBidListService iBidListService;
//	
//	BidList bid1;
//	List<BidList> BidListList;
//	
////	private OAuth2User oAuth2User;
//
////	@BeforeEach
////	void initialize() {
////		bid1 = new BidList(null, "Account1", "Type1", 1d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
////		bid1.setId(1);
////		BidList bid2 = new BidList(null, "Account2", "Type2", 2d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
////		bid2.setId(2);
////		BidList bid3 = new BidList(null, "Account3", "Type3", 3d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
////		bid3.setId(3);
////		BidListList = new ArrayList<>();
////		BidListList.add(bid1);
////		BidListList.add(bid2);
////		BidListList.add(bid3);		
//		
////		oAuth2User = OAuthUtils.createOAuth2User(
// //               "Jerome L", "jerome13250@example.com");
//		
////	}
////	@Test
////	@WithMockUser
////	public void testHomePage() throws Exception {
////	    this.mockMvc.perform(get("http://localhost:8080/bidList/list"))
////	            .andExpect(status().isOk())
//////	            .andExpect(view().name("bidList/list"))
////	            .andDo(MockMvcResultHandlers.print());
////	}
//	
//	@Test
//	@WithMockUser
//	public void test_string_home() {
//		try {
//			mockMvc.perform(get("bidList/list"))
//			.andExpect(status().isFound());
//			System.err.println("ok");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void getRequestBidListAddViewShouldReturnSuccess() throws Exception {
////        //1. Setup
////
////        //2. Act
////        mockMvc.perform(get("/bidList/add"))
////        //3. Assert
////                .andExpect(status().is2xxSuccessful())
////                .andExpect(view().name("bidList/add"))
////                .andExpect(model().attributeExists("bidList"))
////                .andReturn();
////    }
////	@Test
////	public void givenNotLogged_shouldBeRedirectedToLogin() throws Exception {
////		//ACT+ASSERT
////		mockMvc.perform(get("/bidList/list"))
////		.andExpect(status().isFound()) //FOUND: status=302
////		;
////	}
//
////	@WithMockUser //annotation to test spring security with mock user 
////	@Test
////	void givenMockUser_shouldSucceedWith200() throws Exception {
////		//ARRANGE:
////		when(iBidListService.findAllBidList()).thenReturn(BidListList);
////		//ACT+ASSERT:
////		mockMvc.perform(get("/bidList/list"))
////		.andDo(print())
////		.andExpect(status().is2xxSuccessful())
////		.andExpect(view().name("bidList/list"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeExists("listofbidlist"))
////		;
////	}
//	
//
////	@Test
////	void givenOauth2User_shouldSucceedWith200() throws Exception {
////		//ARRANGE:
////		when(bidListService.findAllBidList()).thenReturn(BidListList);
////		//ACT+ASSERT:
////		mockMvc.perform(get("/bidList/list")
////				.with(oauth2Login().oauth2User(oAuth2User)))
////		.andDo(print())
////		.andExpect(status().is2xxSuccessful())
////		.andExpect(view().name("bidList/list"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeExists("listofbidlist"))
////		.andExpect(content().string(containsString("Jerome L")));
////		;
////	}
////	
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void GET_addBidForm_shouldSucceedWith200() throws Exception {
////		
////		//ACT+ASSERT:
////		mockMvc.perform(get("/bidList/add"))
////		.andDo(print())
////		.andExpect(status().is2xxSuccessful())
////		.andExpect(view().name("bidList/add"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeExists("bidList"))
////		;
////	}
////	
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void POST_bidListValidate_shouldSucceedWithRedirection() throws Exception {
////		
////		//ACT+ASSERT:
////		mockMvc.perform(post("/bidList/validate")
////				.param("account", "accountOfBid")
////				.param("type", "typeOfBid")
////				.param("bidQuantity", "1000")
////				.with(csrf())
////				)
////		.andDo(print())
////		.andExpect(status().is3xxRedirection())
////		.andExpect(view().name("redirect:/bidList/list"))
////		;
////		
////		ArgumentCaptor<BidList> bidListCaptor = ArgumentCaptor.forClass(BidList.class);
////		verify(bidListService).save(bidListCaptor.capture());
////		BidList savedBidList = bidListCaptor.getValue();
////		assertEquals("accountOfBid",savedBidList.getAccount());
////		assertEquals("typeOfBid",savedBidList.getType());
//////		assertEquals(1000d,savedBidList.getBidQuantity());
////		
////	}
////
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void POST_bidListValidate_formValidationFailed_NoData() throws Exception {
////		
////		//ACT+ASSERT:
////		mockMvc.perform(post("/bidList/validate")
////				//.param("account", "accountOfBid")
////				//.param("type", "typeOfBid")
////				//.param("bidQuantity", "1000")
////				.with(csrf())
////				)
////		.andExpect(status().isOk()) //return to validate page to display error
////		.andExpect(view().name("/bidList/add"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeErrorCount("bidList", 3))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "account", "NotBlank"))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "type", "NotBlank"))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "bidQuantity", "NotNull"))
////		;
////		
////		//BidList must not be saved
////		verify(bidListService,never()).save(any(BidList.class));
////		
////	}
////	
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void POST_bidListValidate_formValidationFailed_BlankAndInvalidDigits() throws Exception {
////		
////		//ACT+ASSERT:
////		mockMvc.perform(post("/bidList/validate")
////				.param("account", "")
////				.param("type", "")
////				.param("bidQuantity", "100000000000000000000000000000000")
////				.with(csrf())
////				)
////		.andExpect(status().isOk()) //return to validate page to display error
////		.andExpect(view().name("/bidList/add"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeErrorCount("bidList", 3))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "account", "NotBlank"))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "type", "NotBlank"))
////		.andExpect(model().attributeHasFieldErrorCode("bidList", "bidQuantity", "Digits"))
////		;
////		
////		//BidList must not be saved
////		verify(bidListService,never()).save(any(BidList.class));
////		
////	}
////	
////
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void GET_showUpdateForm_shouldSucceedWith200() throws Exception {
////		//ARRANGE:
////		when(bidListService.findBidListById(1)).thenReturn(Optional.of(bid1));
////		
////		//ACT+ASSERT:
////		mockMvc.perform(get("/bidList/update/1"))
////		.andDo(print())
////		.andExpect(status().is2xxSuccessful())
////		.andExpect(view().name("bidList/update"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeExists("bidList"))
////		;
////	}
////	
////	@WithMockUser //annotation to test spring security with mock user : here we have default values "user","password","USER_ROLE"
////	@Test
////	void GET_showUpdateForm_shouldReturnErrorPage() throws Exception {
////		//ARRANGE:
////		when(bidListService.findBidListById(1)).thenReturn(Optional.empty());
////		
////		//ACT+ASSERT:
////		mockMvc.perform(get("/bidList/update/1"))
////		.andDo(print())
////		.andExpect(status().is2xxSuccessful())
////		.andExpect(view().name("error"))
////		.andExpect(model().size(1))
////		.andExpect(model().attributeExists("errorMsg"))
////		;
////	}
////	
//////	@WithMockUser
//////	@Test
//////	void POST_bidListUpdate_shouldSucceedWithRedirection() throws Exception {
//////		//ARRANGE:
//////		when(bidListService.fin(1)).thenReturn(Boolean.TRUE);
//////		
//////		//ACT+ASSERT:
//////		mockMvc.perform(post("/bidList/update/1")
//////				.param("account", "accountOfBid")
//////				.param("type", "typeOfBid")
//////				.param("bidQuantity", "1000")
//////				.with(csrf())
//////				)
//////		.andDo(print())
//////		.andExpect(status().is3xxRedirection())
//////		.andExpect(view().name("redirect:/bidList/list"))
//////		;
//////		
//////		ArgumentCaptor<BidList> bidListCaptor = ArgumentCaptor.forClass(BidList.class);
//////		verify(bidListService).save(bidListCaptor.capture());
//////		BidList savedBidList = bidListCaptor.getValue();
//////		assertEquals(1,savedBidList.getBidListId());
//////		assertEquals("accountOfBid",savedBidList.getAccount());
//////		assertEquals("typeOfBid",savedBidList.getType());
//////		assertEquals(1000d,savedBidList.getBidQuantity());
//////	}
////	
//////	@WithMockUser
//////	@Test
//////	void POST_bidListUpdate_IdDoesNotExist_shouldReturnErrorPage() throws Exception {
//////		//ARRANGE:
//////		when(bidListService.existsById(1)).thenReturn(Boolean.FALSE);
//////		
//////		//ACT+ASSERT:
//////		mockMvc.perform(post("/bidList/update/1")
//////				.param("account", "accountOfBid")
//////				.param("type", "typeOfBid")
//////				.param("bidQuantity", "1000")
//////				.with(csrf())
//////				)
//////		.andExpect(status().is2xxSuccessful())
//////		.andExpect(view().name("error"))
//////		.andExpect(model().attributeExists("errorMsg"))
//////		;
//////	}
////	
//////	@WithMockUser
//////	@Test
//////	void POST_bidListUpdate_FormValidationFail_NoDAta_shouldReturnErrorPage() throws Exception {
//////		//ARRANGE:
//////		when(bidListService.existsById(1)).thenReturn(Boolean.TRUE);
//////		
//////		//ACT+ASSERT:
//////		mockMvc.perform(post("/bidList/update/1")
//////				//.param("account", "accountOfBid")
//////				//.param("type", "typeOfBid")
//////				//.param("bidQuantity", "1000")
//////				.with(csrf())
//////				)
//////		.andExpect(status().isOk()) //return to validate page to display error
//////		.andExpect(view().name("bidList/update"))
//////		.andExpect(model().size(1))
//////		.andExpect(model().attributeErrorCount("bidList", 3))
//////		.andExpect(model().attributeHasFieldErrorCode("bidList", "account", "NotBlank"))
//////		.andExpect(model().attributeHasFieldErrorCode("bidList", "type", "NotBlank"))
//////		.andExpect(model().attributeHasFieldErrorCode("bidList", "bidQuantity", "NotNull"))
//////		;
//////	}
////	
////	
//////	@WithMockUser
//////	@Test
//////	void POST_bidListDelete_shouldSucceedWithRedirection() throws Exception {
//////		//ARRANGE:
//////		when(bidListService.existsById(1)).thenReturn(Boolean.TRUE);
//////				
//////		//ACT+ASSERT:
//////		mockMvc.perform(get("/bidList/delete/1")
//////				)
//////		.andDo(print())
//////		.andExpect(status().is3xxRedirection())
//////		.andExpect(view().name("redirect:/bidList/list"))
//////		;
//////		
//////		verify(bidListService).deleteById(1);
//////		
//////	}
////	
//////	@WithMockUser
//////	@Test
//////	void GET_bidListDelete_IdDoesNotExist_shouldReturnErrorPage() throws Exception {
//////		//ARRANGE:
//////		when(bidListService.existsById(1)).thenReturn(Boolean.FALSE);
//////		
//////		//ACT+ASSERT:
//////		mockMvc.perform(get("/bidList/delete/1")
//////					)
//////		.andExpect(status().is2xxSuccessful())
//////		.andExpect(view().name("error"))
//////		.andExpect(model().attributeExists("errorMsg"))
//////		;
//////		
//////		//User must not be deleted
//////		verify(bidListService,never()).deleteById(1);
//////	}
////	
//}
