package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.nnk.springboot.domain.Rating;

public interface IRatingService {

	List<Rating> findAllRating();

	Rating save(@Valid Rating rating);

	Optional<Rating> findAllRatingById(Integer id);

	void delete(Rating rating);

}
