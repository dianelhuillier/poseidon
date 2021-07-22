package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.nnk.springboot.domain.BidList;

public interface IBidlListService {

	List<BidList> findAllBidList();

	BidList save(@Valid BidList bid);

	Optional<BidList> findBidListById(Integer BidListId);

	void delete(BidList bid);
}
