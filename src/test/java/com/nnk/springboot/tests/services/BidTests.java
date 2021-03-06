package com.nnk.springboot.tests.services;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.services.IBidListService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.jpa.properties.javax.persistence.validation.mode=none"})
public class BidTests {


	@Autowired
	IBidListService iBidlListService;

	@Test
	@Transactional
	public void bidListTest() {
		BidList bid = new BidList(null, "Account Test", "Type Test", 10d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

		// Save
		bid = iBidlListService.save(bid);
		Assert.assertNotNull(bid.getId());
		Assert.assertEquals(bid.getBidQuantity(), 10d, 10d);

		// Update
		bid.setBidQuantity(20d);
		bid = iBidlListService.save(bid);
		Assert.assertEquals(bid.getBidQuantity(), 20d, 20d);

		// Find
		List<BidList> listResult = iBidlListService.findAllBidList();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = bid.getId();
		iBidlListService.delete(bid);
		Optional<BidList> bidList = iBidlListService.findBidListById(id);
		Assert.assertFalse(bidList.isPresent());
	}
}
