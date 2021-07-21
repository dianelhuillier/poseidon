package com.nnk.springboot;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;
import com.nnk.springboot.services.ITradeService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.jpa.properties.javax.persistence.validation.mode=none"})
public class TradeTests {

	@Autowired
	private TradeRepository tradeRepository;
	@Autowired
	ITradeService iTradeService;

	@Test
	@Transactional
	//null, "Trade Account", "Type"
	public void tradeTest() {
		Trade trade = new Trade(1, "Trade Account", "Type") ;
		trade.setTradeDate(new Timestamp(System.currentTimeMillis()));

		// Save
		trade = iTradeService.save(trade);
		Assert.assertNotNull(trade.getId());
		Assert.assertTrue(trade.getAccount().equals("Trade Account"));

		// Update
		trade.setAccount("Trade Account Update");
		trade = iTradeService.save(trade);
		Assert.assertTrue(trade.getAccount().equals("Trade Account Update"));

		// Find
		List<Trade> listResult = iTradeService.findAllTrade();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = trade.getId();
		iTradeService.delete(trade);
		Optional<Trade> tradeList = tradeRepository.findById(id);
		Assert.assertFalse(tradeList.isPresent());
	}
}