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

/**
 * @Description
 * @author 我
 * @version
 * @date 2019年11月1日下午5:31:03
 */
@Service
public class CbServiceTwoImple{

	@Autowired
	private CbMapper cbMapper;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void inserCbTwo() {
		Cb cb = new Cb(2,"cjt");
		cbMapper.insertCb(cb);
		throw new RuntimeException("throw出去");
	}

}
