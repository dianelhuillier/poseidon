package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.CurvePoint;

public interface ICurvePointService {

	List<CurvePoint> findAllCurvePoint();

	CurvePoint save(@Valid CurvePoint curvePoint);

	Optional<CurvePoint> findCurveById(Integer id);

	void delete(CurvePoint curvePoint);


}
