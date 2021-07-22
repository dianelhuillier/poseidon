package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import com.nnk.springboot.domain.RuleName;

public interface IRuleNameService {

	RuleName save(RuleName rule);

	List<RuleName> findAllRuleName();

	Optional<RuleName> findRuleById(Integer id);

	void delete(RuleName ruleName);

}
