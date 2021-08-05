package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.services.ICurvePointService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;

import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
public class CurveController {
	// TODO: Inject Curve Point service
	@Autowired
	ICurvePointService iCurvePointService;

	private static final Logger logger = LogManager.getLogger("Poseidon");

	@RequestMapping("/curvePoint/list")
	public String home(Model model)
	{
		// TODO: find all Curve Point, add to model
		model.addAttribute("curvePoints", iCurvePointService.findAllCurvePoint());
		logger.info("/curvePoint/list OK");
		return "curvePoint/list";
	}

	@GetMapping("/curvePoint/add")
	public String addCurveForm(CurvePoint bid) {
		logger.info("GET /curvePoint/add OK");
		return "curvePoint/add";
	}

	@PostMapping("/curvePoint/validate")
	public String validate(@Valid CurvePoint curvePoint, BindingResult result, Model model) {
		// TODO: check data valid and save to db, after saving return Curve list
		if (!result.hasErrors()) {
			curvePoint.setAsOfDate(new Timestamp(System.currentTimeMillis()));
			curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
			iCurvePointService.save(curvePoint);
			model.addAttribute("curvePoints", iCurvePointService.findAllCurvePoint());
			logger.info("POST /curvePoint/validate OK");
			return "redirect:/curvePoint/list";
		}
		logger.error("POST /curvePoint/validate has errors");
		return "curvePoint/add";
	}

	@GetMapping("/curvePoint/update/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		// TODO: get CurvePoint by Id and to model then show to the form
		CurvePoint curvePoint = iCurvePointService.findCurveById(id).get();
		model.addAttribute("curvePoint", curvePoint);
		logger.info("GET /curvePoint/update/Id OK");
		return "curvePoint/update";
	}

	@PostMapping("/curvePoint/update/{id}")
	public String updateCurve(@PathVariable("id") Integer id, @Valid CurvePoint curvePoint,
			BindingResult result, Model model) {
		// TODO: check required fields, if valid call service to update Curve and return Curve list
//		Integer curveId = curvePoint.getCurveId();
//		double term = curvePoint.getTerm();
//		double value = curvePoint.getValue();
		if (result.hasErrors()) {
			logger.error("POST /curvePoint/update/id has errors");
			return "curvePoint/update";
		}
		curvePoint.setAsOfDate(new Timestamp(System.currentTimeMillis()));

		iCurvePointService.save(curvePoint);
		model.addAttribute("curvePoints", iCurvePointService.findAllCurvePoint());
		logger.info("POST /curvePoint/update/id OK");
		return "redirect:/curvePoint/list";
	}

	@GetMapping("/curvePoint/delete/{id}")
	public String deleteCurve(@PathVariable("id") Integer id, Model model) {
		// TODO: Find Curve by Id and delete the Curve, return to Curve list
		CurvePoint curvePoint = iCurvePointService.findCurveById(id).get();
		iCurvePointService.delete(curvePoint);
		model.addAttribute("curvePoints", iCurvePointService.findAllCurvePoint());
		logger.info("GET /curvePoint/delete/id has error");
		return "redirect:/curvePoint/list";
	}
}
