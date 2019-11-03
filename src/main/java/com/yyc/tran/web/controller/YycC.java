/**
 * 
 */
package com.yyc.tran.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyc.tran.web.service.CbService;

@RestController
public class YycC {
	@Autowired
	private CbService cbService;
	
	@GetMapping("/insertCb")
	public void insertCb() {
		cbService.inserCb();
	}
}
