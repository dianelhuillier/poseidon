package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;

@Service
public class TradeService implements ITradeService{

	private TradeRepository tradeRepository;
	
	@Autowired
	public TradeService(TradeRepository tradeRepository) {
		this.tradeRepository=tradeRepository;
	}

	@Override
	public Trade save(Trade trade) {
		// TODO Auto-generated method stub
		return tradeRepository.save(trade);
	}

	@Override
	public List<Trade> findAllTrade() {
		// TODO Auto-generated method stub
		return tradeRepository.findAll();
	}

	@Override
	public void delete(Trade trade) {
		// TODO Auto-generated method stub
		tradeRepository.delete(trade);
	}

	@Override
	public Optional<Trade> findTradeById(Integer id) {
		// TODO Auto-generated method stub
		return tradeRepository.findTradeById(id);
	}




}
