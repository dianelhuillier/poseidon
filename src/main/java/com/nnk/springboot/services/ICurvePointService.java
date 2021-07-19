package com.nnk.springboot.services;

import java.util.List;

import javax.validation.Valid;

import com.nnk.springboot.domain.CurvePoint;

public interface ICurvePointService {

	List<CurvePoint> findAllCurvePoint();

	CurvePoint save(@Valid CurvePoint curvePoint);

}
