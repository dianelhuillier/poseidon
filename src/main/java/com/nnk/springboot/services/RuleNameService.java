package com.nnk.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;

@Service
public class RuleNameService implements IRuleNameService{

	private RuleNameRepository ruleNameRepository;
	
	@Autowired
	public RuleNameService(RuleNameRepository ruleNameRepository) {
		this.ruleNameRepository=ruleNameRepository;
	}
	
	@Override
	public RuleName save(RuleName rule) {
		// TODO Auto-generated method stub
		return ruleNameRepository.save(rule);
	}

	@Override
	public List<RuleName> findAllRuleName() {
		// TODO Auto-generated method stub
		return ruleNameRepository.findAll();
	}

}
