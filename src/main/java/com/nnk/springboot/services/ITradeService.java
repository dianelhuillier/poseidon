package com.nnk.springboot.services;

import java.util.List;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;

public interface ITradeService {

	 Trade save(Trade trade);

	List<Trade> findAllTrade();

}