package com.nnk.springboot.tests.services;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;
import com.nnk.springboot.services.ICurvePointService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.jpa.properties.javax.persistence.validation.mode=none"})
public class CurvePointTests {

	@Autowired
	private CurvePointRepository curvePointRepository;

	@Autowired
	ICurvePointService iCurvePointService;


	
	
	@Test
	@Transactional
	public void curvePointTest() {
		CurvePoint curvePoint = new CurvePoint(10, 10, null, 10d, 30d, null);
		curvePoint.setAsOfDate(new Timestamp(System.currentTimeMillis()));
		curvePoint.setCreationDate(new Timestamp(System.currentTimeMillis()));
		// Save
		curvePoint = iCurvePointService.save(curvePoint);
		Assert.assertNotNull(curvePoint.getId());
		Assert.assertTrue(curvePoint.getCurveId() == 10);

		// Update
		curvePoint.setCurveId(20);
		curvePoint = iCurvePointService.save(curvePoint);
		Assert.assertTrue(curvePoint.getCurveId() == 20);

		// Find
		List<CurvePoint> listResult = iCurvePointService.findAllCurvePoint();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = curvePoint.getId();
		curvePointRepository.delete(curvePoint);
		Optional<CurvePoint> curvePointList = iCurvePointService.findCurveById(id);
		Assert.assertFalse(curvePointList.isPresent());
	}

}
