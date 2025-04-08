package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 培养计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
@TableName("peiyangjihua")
public class PeiyangjihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeiyangjihuaEntity() {
		
	}
	
	public PeiyangjihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
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
