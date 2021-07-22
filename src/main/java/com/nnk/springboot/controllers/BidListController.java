package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.services.BidListService;
import com.nnk.springboot.services.IBidlListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import javax.validation.Valid;


@Controller
public class BidListController {
	// TODO: Inject Bid service
	@Autowired
	IBidlListService iBidListService;

	@RequestMapping("/bidList/list")
	public String home(Model model)
	{
		// TODO: call service find all bids to show to the view
		model.addAttribute("bidList", iBidListService.findAllBidList());
		return "bidList/list";
	}

	@GetMapping("/bidList/add")
	public String addBidForm(BidList bid) {
		return "bidList/add";
	}

	@PostMapping("/bidList/validate")
	public String validate(@Valid BidList bid, BindingResult result, Model model) {
		// TODO: check data valid and save to db, after saving return bid list in service
		if (!result.hasErrors()) {
			iBidListService.save(bid);
			model.addAttribute("bidLists", iBidListService.findAllBidList());
		}
		return "bidList/add";
	}

	@GetMapping("/bidList/update/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		// TODO: get Bid by Id and to model then show to the form
		BidList bidList = iBidListService.findBidListById(id).get();
		//   	bidList.setBidQuantity(null);
		model.addAttribute("bidList", bidList);
		return "bidList/update";
	}

	@PostMapping("/bidList/update/{id}")
	public String updateBid(@PathVariable("id") Integer id, @Valid BidList bidList,
			BindingResult result, Model model) {
		// TODO: check required fields, if valid call service to update Bid and return list Bid
		if (!result.hasErrors()) {
			return "bidList/update";
		}
		iBidListService.save(bidList);
		model.addAttribute("bidLists", iBidListService.findAllBidList());
		return "redirect:/bidList/list";
	}

	@GetMapping("/bidList/delete/{id}")
	public String deleteBid(@PathVariable("id") Integer id, Model model) {
		// TODO: Find Bid by Id and delete the bid, return to Bid list
		BidList bidList = iBidListService.findBidListById(id).get();

		iBidListService.delete(bidList);
		model.addAttribute("bidLists", iBidListService.findAllBidList());
		return "redirect:/bidList/list";
	}
}
