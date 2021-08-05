package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.services.IRuleNameService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
public class RuleNameController {
    // TODO: Inject RuleName service
	@Autowired
	private IRuleNameService iRuleNameService;

	private static final Logger logger = LogManager.getLogger("Poseidon");

    @RequestMapping("/ruleName/list")
    public String home(Model model)
    {
        // TODO: find all RuleName, add to model
    	model.addAttribute("ruleNames", iRuleNameService.findAllRuleName());
		logger.info("/ruleName/list OK");
		return "ruleName/list";
    }

    @GetMapping("/ruleName/add")
    public String addRuleForm(RuleName bid) {
		logger.info("GET /ruleName/add OK");
        return "ruleName/add";
    }

    @PostMapping("/ruleName/validate")
    public String validate(@Valid RuleName ruleName, BindingResult result, Model model) {
        // TODO: check data valid and save to db, after saving return RuleName list
        if (!result.hasErrors()) {
        	iRuleNameService.save(ruleName);
        	model.addAttribute("ruleNames", iRuleNameService.findAllRuleName());
			logger.info("POST /ruleName/validate OK");
        	return "redirect:/ruleName/list";
        }
		logger.error("POST /ruleName/validate has errors");
    	return "ruleName/add";
    }

    @GetMapping("/ruleName/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        // TODO: get RuleName by Id and to model then show to the form
    	RuleName ruleName = iRuleNameService.findRuleById(id).get();
    	model.addAttribute("ruleName", ruleName);
		logger.info("GET /ruleName/update/Id OK");
        return "ruleName/update";
    }

    @PostMapping("/ruleName/update/{id}")
    public String updateRuleName(@PathVariable("id") Integer id, @Valid RuleName ruleName,
                             BindingResult result, Model model) {
        // TODO: check required fields, if valid call service to update RuleName and return RuleName list
		if (result.hasErrors()) {
			logger.error("POST /ruleName/update/id has errors");
			return "ruleName/update";
		}
		iRuleNameService.save(ruleName);
		model.addAttribute("ruleNames", iRuleNameService.findAllRuleName());
		logger.info("POST /ruleName/update/id OK");
		return "redirect:/ruleName/list";
    }

    @GetMapping("/ruleName/delete/{id}")
    public String deleteRuleName(@PathVariable("id") Integer id, Model model) {
        // TODO: Find RuleName by Id and delete the RuleName, return to Rule list
    	RuleName ruleName = iRuleNameService.findRuleById(id).get();
    	
    	iRuleNameService.delete(ruleName);
    	model.addAttribute("ruleNames", iRuleNameService.findAllRuleName());
		logger.info("GET /ruleName/delete/id has error");
    	return "redirect:/ruleName/list";
    }
}
