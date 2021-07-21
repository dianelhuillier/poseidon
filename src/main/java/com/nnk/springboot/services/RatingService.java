package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;

@Service
public class RatingService implements IRatingService {

	private RatingRepository ratingRepository;
	
	@Autowired 
	RatingService(RatingRepository ratingRepository){
		this.ratingRepository=ratingRepository;
	}
	
	@Override
	public List<Rating> findAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating save(@Valid Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public Optional<Rating> findAllRatingById(Integer id) {
		// TODO Auto-generated method stub
		return ratingRepository.findRatingById(id);
	}

	@Override
	public void delete(Rating rating) {
		// TODO Auto-generated method stub
		ratingRepository.delete(rating);
	}

}
