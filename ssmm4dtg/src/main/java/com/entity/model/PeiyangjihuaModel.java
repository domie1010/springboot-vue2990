package com.entity.model;

import com.entity.PeiyangjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 培养计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public class PeiyangjihuaModel  implements Serializable {
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
