package com.entity.model;

import com.entity.YuanxibanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 院系班级
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public class YuanxibanjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 总人数
	 */
	
	private String zongrenshu;
		
	/**
	 * 名单
	 */
	
	private String mingdan;
				
	
	/**
	 * 设置：总人数
	 */
	 
	public void setZongrenshu(String zongrenshu) {
		this.zongrenshu = zongrenshu;
	}
	
	/**
	 * 获取：总人数
	 */
	public String getZongrenshu() {
		return zongrenshu;
	}
				
	
	/**
	 * 设置：名单
	 */
	 
	public void setMingdan(String mingdan) {
		this.mingdan = mingdan;
	}
	
	/**
	 * 获取：名单
	 */
	public String getMingdan() {
		return mingdan;
	}
			
}
