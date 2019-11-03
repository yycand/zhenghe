/**
 * 
 */
package com.yyc.tran.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yyc.tran.web.entry.Cb;

/**
 * @Description
 * @author 我
 * @version
 * @date 2019年11月1日下午4:20:13
 */
@Mapper
public interface CbMapper {
	void insertCb(Cb cb);
}
