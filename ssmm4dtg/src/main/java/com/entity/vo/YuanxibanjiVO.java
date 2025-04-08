package com.entity.vo;

import com.entity.YuanxibanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 院系班级
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public class YuanxibanjiVO  implements Serializable {
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
