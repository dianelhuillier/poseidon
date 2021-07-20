package com.nnk.springboot.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;

@Service
public class CurvePointService implements ICurvePointService{

	private CurvePointRepository curvePointRepository;

	@Autowired
	public CurvePointService(CurvePointRepository curvePointRepository) {
		this.curvePointRepository= curvePointRepository;
	}
	
	
	@Override
	public List<CurvePoint> findAllCurvePoint() {
		// TODO Auto-generated method stub
		return curvePointRepository.findAll();
	}


	@Override
	public CurvePoint save(@Valid CurvePoint curvePoint) {
		// TODO Auto-generated method stub
		return curvePointRepository.save(curvePoint);
	}




}
