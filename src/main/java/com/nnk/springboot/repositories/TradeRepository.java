package com.nnk.springboot.repositories;

import com.nnk.springboot.domain.Trade;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TradeRepository extends JpaRepository<Trade, Integer> {

	Optional<Trade> findTradeById(Integer id);

}
