package com.nnk.springboot.tests.services;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;
import com.nnk.springboot.services.IRatingService;

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
public class RatingTests {


	@Autowired
	IRatingService iRatingService;

	@Test
	@Transactional
	public void ratingTest() {
		Rating rating = new Rating(null, "Moodys Rating", "Sand PRating", "Fitch Rating", 10);

		// Save
		rating = iRatingService.save(rating);
		Assert.assertNotNull(rating.getId());
		Assert.assertTrue(rating.getOrderNumber() == 10);

		// Update
		rating.setOrderNumber(20);
		rating = iRatingService.save(rating);
		Assert.assertTrue(rating.getOrderNumber() == 20);

		// Find
		List<Rating> listResult = iRatingService.findAllRating();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = rating.getId();
		iRatingService.delete(rating);
		Optional<Rating> ratingList = iRatingService.findAllRatingById(id);
		Assert.assertFalse(ratingList.isPresent());
	}
}
