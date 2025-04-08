package com.entity.vo;

import com.entity.PeiyangjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 培养计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public class PeiyangjihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学分
	 */
	
	private Float xuefen;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 培养计划
	 */
	
	private String peiyangjihua;
				
	
	/**
	 * 设置：学分
	 */
	 
	public void setXuefen(Float xuefen) {
		this.xuefen = xuefen;
	}
	
	/**
	 * 获取：学分
	 */
	public Float getXuefen() {
		return xuefen;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：培养计划
	 */
	 
	public void setPeiyangjihua(String peiyangjihua) {
		this.peiyangjihua = peiyangjihua;
	}
	
	/**
	 * 获取：培养计划
	 */
	public String getPeiyangjihua() {
		return peiyangjihua;
	}
			
}
