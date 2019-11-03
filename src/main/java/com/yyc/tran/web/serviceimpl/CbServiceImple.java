/**
 * 
 */
package com.yyc.tran.web.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yyc.tran.web.dao.CbMapper;
import com.yyc.tran.web.entry.Cb;
import com.yyc.tran.web.service.CbService;

/**
 * @Description
 * @author 我
 * @version
 * @date 2019年11月1日下午4:17:37
 */
@Service
public class CbServiceImple implements CbService{

	@Autowired
	private CbMapper cbMapper;
	
	@Autowired
	private CbServiceTwoImple csti;
	
	@Override
	@Transactional
	public void inserCb() {
		Cb cb = new Cb(1,"yyc");
		cbMapper.insertCb(cb);
		csti.inserCbTwo();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void inserCbTwo() {
		Cb cb = new Cb(2,"cjt");
		cbMapper.insertCb(cb);
		throw new RuntimeException("throw出去");
	}

}
