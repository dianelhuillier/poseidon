package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.RuleName;

@Service
public interface IRuleNameService {

	RuleName save(RuleName rule);

	List<RuleName> findAllRuleName();

	Optional<RuleName> findRuleById(Integer id);

	void delete(RuleName ruleName);

}
