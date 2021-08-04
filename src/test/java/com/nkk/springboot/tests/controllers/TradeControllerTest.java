//package com.nkk.springboot.tests.controllers;
//
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux;
//import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.nnk.springboot.domain.Trade;
//import com.nnk.springboot.services.ITradeService;
//import com.nnk.springboot.services.TradeService;
//
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertTrue;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.doReturn;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
////@SpringBootTest(classes = TradeControllerTest.class)
//@WebMvcTest
//@AutoConfigureWebTestClient
//@AutoConfigureWebMvc
//
//public class TradeControllerTest {
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webContext;
//
//    @MockBean
//    TradeService tradeService;
//
//    @Before
//    public void setupMockmvc() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void getRequestTradeListViewShouldReturnSuccess() throws Exception {
//        //1. Setup
//
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
//
//        Trade trade = new Trade();
//        trade.setId(28);
//        trade.setAccount("Trade Account");
//        trade.setType("Type");
//        trade.setCreationName("Creation Name");
//        trade.setTradeDate(new Timestamp(System.currentTimeMillis()));
//        trade.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        List<Trade> tradeList = new ArrayList<>();
//        tradeList.add(trade);
//
//        doReturn(tradeList)
//                .when(tradeService)
//                .findAllTrade();
//
//        //2. Act
//        mockMvc.perform(get("/trade/list"))
//        //3. Assert
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(view().name("trade/list"))
//                .andExpect(model().attributeExists("trade"))
//                .andReturn();
//        assertTrue(tradeList.get(0).getType().equals("Type"));
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void getRequestTradeAddViewShouldReturnSuccess() throws Exception {
//        //1. Setup
//
//        //2. Act
//        mockMvc.perform(get("/trade/add"))
//        //3. Assert
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(view().name("trade/add"))
//                .andExpect(model().attributeExists("trade"))
//                .andReturn();
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
//    public void postRequestTradeValidateShouldReturnSuccess() throws Exception {
//        //1. Setup
//
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
//
//        Trade trade = new Trade();
//        trade.setId(28);
//        trade.setAccount("Trade Account");
//        trade.setType("Type");
//        trade.setCreationName("Creation Name");
//        trade.setTradeDate(new Timestamp(System.currentTimeMillis()));
//        trade.setCreationDate(new Timestamp(System.currentTimeMillis()));
//
//        List<Trade> tradeList = new ArrayList<>();
//        tradeList.add(trade);
//
////        doReturn(true)
////                .when(itradeService)
////                .checkIfTradeIdExists(trade.getId());
//
//        doNothing()
//                .when(tradeService)
//                .save(trade);
//
//        doReturn(tradeList)
//                .when(tradeService)
//                .findAllTrade();
//        //2. Act
//        mockMvc.perform(post("/trade/validate")
//                .flashAttr("successSaveMessage", "Your trade was successfully added")
//                .param("tradeId", "28")
//                .param("account", "Trade Account")
//                .param("type", "Type")
//                .param("creationName", "Creation Name")
//                .param("tradeDate", "2024-01-02T07:21")
//                .param("creationDate", "2024-01-02T07:21"))
//        //3. Assert
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/trade/list"))
//                .andExpect(flash().attributeExists("successSaveMessage"))
//                .andReturn();
//        assertTrue(tradeList.get(0).getType().equals("Type"));
//    }
////
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void getRequestTradeUpdateIdShouldReturnSuccess() throws Exception {
////        //1. Setup
////
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
////
////        TradeModel trade = new TradeModel();
////        trade.setTradeId(28);
////        trade.setAccount("Trade Account");
////        trade.setType("Type");
////        trade.setCreationName("Creation Name");
////        trade.setTradeDate(date);
////        trade.setCreationDate(date);
////
////        doReturn(true)
////                .when(itradeService)
////                .checkIfTradeIdExists(trade.getTradeId());
////
////        doReturn(trade)
////                .when(itradeService)
////                .getTradeById(trade.getTradeId());
////        //2. Act
////        mockMvc.perform(get("/trade/update/{id}", "28"))
////        //3. Assert
////                .andExpect(status().is2xxSuccessful())
////                .andExpect(view().name("trade/update"))
////                .andExpect(model().attributeExists("trade"))
////                .andReturn();
////        assertTrue(trade.getType().equals("Type"));
////    }
////
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void postRequestTradeUpdateIdShouldReturnSuccess() throws Exception {
////        //1. Setup
////
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
////
////        TradeModel trade = new TradeModel();
////        trade.setTradeId(28);
////        trade.setAccount("Trade Account");
////        trade.setType("Type");
////        trade.setCreationName("Creation Name");
////        trade.setTradeDate(date);
////        trade.setCreationDate(date);
////
////        List<TradeModel> tradeList = new ArrayList<>();
////        tradeList.add(trade);
////
////        doReturn(true)
////                .when(itradeService)
////                .checkIfTradeIdExists(trade.getTradeId());
////
////        doNothing()
////                .when(itradeService)
////                .saveTrade(trade);
////
////        doReturn(tradeList)
////                .when(itradeService)
////                .getAllTrades();
////
////        //2. Act
////        mockMvc.perform(post("/trade/update/{id}", "28")
////                .flashAttr("successUpdateMessage", "Your trade was successfully updated")
////                .param("tradeId", "28")
////                .param("account", "Trade Account")
////                .param("type", "Type")
////                .param("creationName", "Creation Name")
////                .param("tradeDate", "2024-01-02T07:21")
////                .param("creationDate", "2024-01-02T07:21"))
////        //3. Assert
////                .andExpect(status().is3xxRedirection())
////                .andExpect(view().name("redirect:/trade/list"))
////                .andExpect(flash().attributeExists("successUpdateMessage"))
////                .andReturn();
////        assertTrue(tradeList.get(0).getType().equals("Type"));
////    }
////
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void getRequestTradeDeleteIdShouldReturnSuccess() throws Exception {
////        //1. Setup
////
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
////
////        TradeModel trade = new TradeModel();
////        trade.setTradeId(28);
////        trade.setAccount("Trade Account");
////        trade.setType("Type");
////        trade.setCreationName("Creation Name");
////        trade.setTradeDate(date);
////        trade.setCreationDate(date);
////
////        List<TradeModel> tradeList = new ArrayList<>();
////        tradeList.add(trade);
////
////        doReturn(true)
////                .when(itradeService)
////                .checkIfTradeIdExists(trade.getTradeId());
////
////        doNothing()
////                .when(itradeService)
////                .deleteTradeById(trade.getTradeId());
////
////        doReturn(tradeList)
////                .when(itradeService)
////                .getAllTrades();
////        //2. Act
////        mockMvc.perform(get("/trade/delete/{id}", "28")
////                .flashAttr("successDeleteMessage", "Your trade was successfully deleted"))
////        //3. Assert
////                .andExpect(status().is3xxRedirection())
////                .andExpect(view().name("redirect:/trade/list"))
////                .andExpect(flash().attributeExists("successDeleteMessage"))
////                .andReturn();
////        assertTrue(tradeList.get(0).getType().equals("Type"));
////    }
////    @Test
////    @WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
////    public void getRequestTradeDeleteIdShouldReturnError() throws Exception {
////        //1. Setup
////
////        long millis= 1706858478726L;
////        LocalDateTime date = new LocalDateTime(millis);
////        LocalDateTime date1 = new LocalDateTime(1706858478726L);
////
////        TradeModel trade = new TradeModel();
////        trade.setTradeId(28);
////        trade.setAccount("Trade Account");
////        trade.setType("Type");
////        trade.setCreationName("Creation Name");
////        trade.setTradeDate(date);
////        trade.setCreationDate(date);
////
////        List<TradeModel> tradeList = new ArrayList<>();
////        tradeList.add(trade);
////
////        doReturn(false)
////                .when(itradeService)
////                .checkIfTradeIdExists(trade.getTradeId());
////
////        doReturn(tradeList)
////                .when(itradeService)
////                .getAllTrades();
////        //2. Act
////        mockMvc.perform(get("/trade/delete/{id}", "1"))
////        //3. Assert
////                .andExpect(status().is3xxRedirection())
////                .andExpect(view().name("redirect:/trade/list"))
////                .andReturn();
////        assertTrue(tradeList.get(0).getType().equals("Type"));
////    }
////}
//}
