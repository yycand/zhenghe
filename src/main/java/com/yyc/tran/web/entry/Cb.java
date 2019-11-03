/**
 * 
 */
package com.yyc.tran.web.entry;

/**
 * @Description
 * @author 我
 * @version
 * @date 2019年11月1日下午4:09:19
 */
public class Cb {
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 */
	public Cb() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 */
	public Cb(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
