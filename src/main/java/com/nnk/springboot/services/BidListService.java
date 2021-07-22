package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;

@Service
public class BidListService implements IBidlListService{

	private BidListRepository bidListRepository;

	@Autowired
	public BidListService(BidListRepository bidListRepository) {
		this.bidListRepository= bidListRepository;
	}


	@Override
	public List<BidList> findAllBidList() {
		return bidListRepository.findAll();
	}


	@Override
	public BidList save(@Valid BidList bid) {
		return bidListRepository.save(bid);
	}


	@Override
	public Optional<BidList> findBidListById(Integer id) {
		return bidListRepository.findBidListById(id);
	}


	
	@Override
	public void delete(BidList bid) {
		bidListRepository.delete(bid);		
	}



}