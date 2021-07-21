package com.nnk.springboot.services;

import java.util.List;

import com.nnk.springboot.domain.RuleName;

public interface IRuleNameService {

	RuleName save(RuleName rule);

	List<RuleName> findAllRuleName();

}
