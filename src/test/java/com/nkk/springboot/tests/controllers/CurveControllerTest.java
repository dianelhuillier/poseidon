package com.nkk.springboot.tests.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

import com.nnk.springboot.controllers.CurveController;
import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.services.ICurvePointService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import lombok.Getter;


////@ExtendWith(MockitoExtension.class)
//@ExtendWith(SpringExtension.class)
////@WebMvcTest(controllers = {CurveController.class})
//
////@WebMvcTest(controllers = RegisterRestController.class)
////@AuthenticationMock.WithUserAuth
//@SpringBootTest(classes = CurveController.class)
//@ContextConfiguration
////@AutoConfigureMockMvc
//@SpringBootConfiguration

@RunWith(SpringRunner.class)

@WebMvcTest(CurveController.class)

public class CurveControllerTest {
//	août 04, 2021 7:09:57 PM org.junit.vintage.engine.descriptor.RunnerTestDescriptor warnAboutUnfilterableRunner
//	WARNING: Runner org.junit.internal.runners.ErrorReportingRunner (used on class com.nkk.springboot.tests.controllers.CurveControllerTest) does not support filtering and will therefore be run completely.

	
//	Logger logger = LoggerFactory.getLogger(CurveControllerTest.class);

    @Autowired
    public MockMvc mvc;
    

	@MockBean
	private ICurvePointService iCurvePointService;
	
	
	
//	@GetMapping("/curvePoint/add")
//	public String addCurveForm(CurvePoint bid) {
//		return "curvePoint/add";
//	}
	
	
	@org.junit.Test
//@WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
public void getRequestBidListAddViewShouldReturnSuccess() throws Exception {
    //1. Setup

//    //2. Act
//    mvc.perform(get("/curvePoint/add"))
//    //3. Assert
//            .andExpect(status().is2xxSuccessful())
//            .andExpect(view().name("curvePoint/add"))
//            .andExpect(model().attributeExists("curvePoint"))
//            .andReturn();
}	
	
}
	
	
	
	
	
	
	
	
//	   @Autowired
//	   private WebApplicationContext wac;
	
//   @SuppressWarnings("deprecation")
//	@BeforeEach
//   public void setup(){
//   	MockitoAnnotations.initMocks(this);
//
//  //Build MockMVC
//       this.mvc = mvc;
//   }
	

    
    
//    @Test
//    public void getHomeListTest() throws Exception {
//        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
//        mvc.perform(get( "/curvePoint" + "/list"))
//                .andExpect(status().isOk()).andExpect(view().name("/curvepoint" + "/list"));
//
//    }






//    
//    
    
////    @InjectMocks
////    private MockMvc mockMvc;
////    
////    
////
////	
//////	@org.junit.Test
//////	public void testHome()  {
//////		List<CurvePoint> curves = iCurvePointService.findAllCurvePoint();
//////		assertNull(curves);
//////	}
////	
////	@MockBean
////	CurvePoint curvePoint;
//	@MockBean
//	CurveController curveControllerTest;

////
////	
////	@BeforeEach
////	public void init() {
////		curveControllerTest = new CurveController();
////	}
////	
////	@Test
////public void addUserTest () throws Exception {
////		when(curvePoint.getCreationDate()).thenReturn(new Timestamp(System.currentTimeMillis()));
//////        mockMvc.perform(post("/calculator")).and
////		final MvcResult result =mockMvc.perform(
////				MockMvcRequestBuilders.post("/curvePoint/validate")
////				.param("term", "1")
////				.param("value", "1")
////				.param("add", "save")
////				).andExpect(result.getResponse().getContentAsString())
////				.contains
////				
////				
////
////	}	
//	
//	
////	@Mock
////	private CurvePointRepository curveRepository;
////	@InjectMocks
////	private ICurvePointService iCurvePointService;
////	@Test
////	public void shouldReturnAllCurvePoints() {
////	List<CurvePoint> curves = new ArrayList();
////	curves.add(new CurvePoint());
////	given(curveRepository.findAll()).willReturn(curves);
////	List<CurvePoint> expected = iCurvePointService.findAllCurvePoint();
////	assertEquals(expected, curves);
////	verify(curveRepository).findAll();
////	}
////	
//
//	
//	
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webContext;
//
//    @MockBean
//    ICurvePointService iCurvePointService;
//
////    @Before
////    public void setupMockmvc() {
////        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
////    }
//	@BeforeEach
//	public void init() {
//		curveControllerTest = new CurveController();
//	}
//	
//	
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void getRequestCurvePointListViewShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        long millis=System.currentTimeMillis();
// //       LocalDateTime date = new LocalDateTime(2024/01/01);
//
//        CurvePoint curvePoint = new CurvePoint();
//        curvePoint.setId(10);
//        curvePoint.setCurveId(2);
//        curvePoint.setTerm(20d);
//        curvePoint.setValue(35d);
//        curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
//curvePoint.setAsOfDate(new Timestamp(System.currentTimeMillis()));
//        List<CurvePoint> curvePointList = new ArrayList<>();
//        curvePointList.add(curvePoint);
//System.err.println(curvePointList);
//        doReturn(curvePointList)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//
//        //2. Act
//        mockMvc.perform(get("/curvePoint/list"))
//        //3. Assert
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(view().name("curvePoint/list"))
//                .andExpect(model().attributeExists("curvePoint"))
//                .andReturn();
//        assertTrue(curvePointList.get(0).getCurveId() == 2);
//    }
//
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void getRequestBidListAddViewShouldReturnSuccess() throws Exception {
////        //1. Setup
////
////        //2. Act
////        mockMvc.perform(get("/curvePoint/add"))
////        //3. Assert
////                .andExpect(status().is2xxSuccessful())
////                .andExpect(view().name("curvePoint/add"))
////                .andExpect(model().attributeExists("curvePoint"))
////                .andReturn();
////    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void postRequestBidListValidateShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        long millis=System.currentTimeMillis();
////        LocalDateTime date = new LocalDateTime(2024/01/01);
//
//        CurvePoint curvePoint = new CurvePoint();
//        curvePoint.setId(10);
//        curvePoint.setCurveId(2);
//        curvePoint.setTerm(20D);
//        curvePoint.setValue(35D);
//        curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        List<CurvePoint> curvePointList = new ArrayList<>();
//        curvePointList.add(curvePoint);
//
//        doNothing()
//                .when(iCurvePointService)
//                .save(curvePoint);
//
//        doReturn(curvePointList)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//        //2. Act
//        mockMvc.perform(post("/curvePoint/validate")
//                 .flashAttr("successSaveMessage", "Your curve point was successfully added")
//                .param("id", "10")
//                .param("curveId", "2")
//                .param("term", "20D")
//                .param("value", "35D"))
//        //3. Assert
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/curvePoint/list"))
//                .andExpect(flash().attributeExists("successSaveMessage"))
//                .andReturn();
//        assertTrue(curvePointList.get(0).getCurveId() == 2);
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void getRequestBidListUpdateIdShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        long millis=System.currentTimeMillis();
// //       LocalDateTime date = new LocalDateTime(2024/01/01);
//
//        CurvePoint curvePoint = new CurvePoint();
//        curvePoint.setId(10);
//        curvePoint.setCurveId(2);
//        curvePoint.setTerm(20D);
//        curvePoint.setValue(35D);
//        curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        doReturn(true)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//
//        doReturn(curvePoint)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//        //2. Act
//        mockMvc.perform(get("/curvePoint/update/{id}", "10"))
//        //3. Assert
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(view().name("curvePoint/update"))
//                .andExpect(model().attributeExists("curvePoint"))
//                .andReturn();
//        assertTrue(curvePoint.getCurveId() == 2);
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void postRequestBidListUpdateIdShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        long millis=System.currentTimeMillis();
////        LocalDateTime date = new LocalDateTime(2024/01/01);
//
//        CurvePoint curvePoint = new CurvePoint();
//        curvePoint.setId(10);
//        curvePoint.setCurveId(2);
//        curvePoint.setTerm(20D);
//        curvePoint.setValue(35D);
//        curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        List<CurvePoint> curvePointList = new ArrayList<>();
//        curvePointList.add(curvePoint);
//
//        doReturn(true)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//
//        doNothing()
//                .when(iCurvePointService)
//                .save(curvePoint);
//
//        doReturn(curvePointList)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//
//        //2. Act
//        mockMvc.perform(post("/curvePoint/update/{id}", "10")
//                .flashAttr("successUpdateMessage", "Your curve point was successfully updated")
//                .param("id", "10")
//                .param("curveId", "2")
//                .param("term", "20D")
//                .param("value", "35D"))
//        //3. Assert
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/curvePoint/list"))
//                .andExpect(flash().attributeExists("successUpdateMessage"))
//                .andReturn();
//        assertTrue(curvePointList.get(0).getCurveId() == 2);
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void getRequestBidListDeleteIdShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        long millis=System.currentTimeMillis();
//  //      LocalDateTime date = new LocalDateTime(2024/01/01);
//
//        CurvePoint curvePoint = new CurvePoint();
//        curvePoint.setId(10);
//        curvePoint.setCurveId(2);
//        curvePoint.setTerm(20D);
//        curvePoint.setValue(35D);
//        curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        List<CurvePoint> curvePointList = new ArrayList<>();
//        curvePointList.add(curvePoint);
//
//        doReturn(true)
//                .when(iCurvePointService)
//                .findCurveById(curvePoint.getId());
//
//        doNothing()
//                .when(iCurvePointService)
//                .delete(curvePoint);
//
//        doReturn(curvePointList)
//                .when(iCurvePointService)
//                .findAllCurvePoint();
//        //2. Act
//        mockMvc.perform(get("/curvePoint/delete/{id}", "10")
//                .flashAttr("successDeleteMessage", "Your curve point was successfully deleted"))
//        //3. Assert
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/curvePoint/list"))
//                .andExpect(flash().attributeExists("successDeleteMessage"))
//                .andReturn();
//        assertTrue(curvePointList.get(0).getCurveId() == 2);
//    }
//    
    
