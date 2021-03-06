package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.services.IRatingService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
public class RatingController {
	// TODO: Inject Rating service
	@Autowired
	IRatingService iRatingService;

	private static final Logger logger = LogManager.getLogger("Poseidon");

	@RequestMapping("/rating/list")
	public String home(Model model)
	{
		// TODO: find all Rating, add to model
		model.addAttribute("ratings", iRatingService.findAllRating());
		logger.info("/rating/list OK");
		return "rating/list";
	}

	@GetMapping("/rating/add")
	public String addRatingForm(Rating rating) {
		logger.info("GET /rating/add OK");
		return "rating/add";
	}

	@PostMapping("/rating/validate")
	public String validate(@Valid Rating rating, BindingResult result, Model model) {
		// TODO: check data valid and save to db, after saving return Rating list
		if (!result.hasErrors()) {
			iRatingService.save(rating);
			model.addAttribute("ratings", iRatingService.findAllRating());
			logger.info("POST /rating/validate OK");
			return "redirect:/rating/list";
		}
		logger.error("POST /rating/validate has errors");
		return "rating/add";
	}

	@GetMapping("/rating/update/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		// TODO: get Rating by Id and to model then show to the form
		Rating rating = iRatingService.findAllRatingById(id).get();
		model.addAttribute("rating", rating);
		logger.info("GET /rating/update/Id OK");
		return "rating/update";
	}

	@PostMapping("/rating/update/{id}")
	public String updateRating(@PathVariable("id") Integer id, @Valid Rating rating,
			BindingResult result, Model model) {
		// TODO: check required fields, if valid call service to update Rating and return Rating list
		if (result.hasErrors()) {
			logger.error("POST /rating/update/id has errors");
			return "rating/update";
		}
		iRatingService.save(rating);
		model.addAttribute("ratings", iRatingService.findAllRating());
		logger.info("POST /rating/update/id OK");
		return "redirect:/rating/list";
	}

	@GetMapping("/rating/delete/{id}")
	public String deleteRating(@PathVariable("id") Integer id, Model model) {
		// TODO: Find Rating by Id and delete the Rating, return to Rating list
		Rating rating = iRatingService.findAllRatingById(id).get();

		iRatingService.delete(rating);
		model.addAttribute("ratings", iRatingService.findAllRating());
		
		logger.info("GET /rating/delete/id has error");
		return "redirect:/rating/list";
	}
}
