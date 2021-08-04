package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.services.IBidListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Timestamp;
import javax.validation.Valid;


@Controller
public class BidListController {
	// TODO: Inject Bid service
	@Autowired
	IBidListService iBidListService;

	private static final Logger logger = LogManager.getLogger("Poseidon");


	@RequestMapping("/bidList/list")
	public String home(Model model)
	{
		// TODO: call service find all bids to show to the view
		model.addAttribute("bidLists", iBidListService.findAllBidList());
		logger.info("/bidList/list OK");
		return "bidList/list";
	}

	@GetMapping("/bidList/add")
	public String addBidForm(BidList bid) {
		logger.info("GET /bidList/add OK");
		return "bidList/add";
	}

	@PostMapping("/bidList/validate")
	public String validate(@Valid BidList bid, BindingResult result, Model model) {
		// TODO: check data valid and save to db, after saving return bid list in service
		if (!result.hasErrors()) {
			bid.setCreationDate(new Timestamp(System.currentTimeMillis()));
			iBidListService.save(bid);
			model.addAttribute("bidLists", iBidListService.findAllBidList());
			logger.info("POST /bidList/validate OK");
			return "redirect:/bidList/list";
		}
		logger.error("POST /bidList/validate has errors");
		return "bidList/add";
	}

	@GetMapping("/bidList/update/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		// TODO: get Bid by Id and to model then show to the form
		BidList bidList = iBidListService.findBidListById(id).get();
		model.addAttribute("bidList", bidList);
		logger.info("GET /bidList/update/Id OK");
		return "bidList/update";
	}

	@PostMapping("/bidList/update/{id}")
	public String updateBid(@PathVariable("id") Integer id, @Valid BidList bidList,
			BindingResult result, Model model) {
		// TODO: check required fields, if valid call service to update Bid and return list Bid
		if (result.hasErrors()) {
			logger.error("POST /bidList/update/id has errors");
			return "bidList/update";
		}
		bidList.setRevisionDate(new Timestamp(System.currentTimeMillis()));

		iBidListService.save(bidList);
		//TODO : setupdate
		model.addAttribute("bidLists", iBidListService.findAllBidList());
		logger.info("POST /bidList/update/id OK");

		return "redirect:/bidList/list";
	}

	@GetMapping("/bidList/delete/{id}")
	public String deleteBid(@PathVariable("id") Integer id, Model model) {
		// TODO: Find Bid by Id and delete the bid, return to Bid list
		BidList bid = iBidListService.findBidListById(id).get();

		iBidListService.delete(bid);
		model.addAttribute("bidLists", iBidListService.findAllBidList());
		logger.info("GET /bidList/delete/id has error");
		return "redirect:/bidList/list";
	}
}
