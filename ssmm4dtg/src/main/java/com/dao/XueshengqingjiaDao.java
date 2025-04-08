package com.dao;

import com.entity.XueshengqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengqingjiaVO;
import com.entity.view.XueshengqingjiaView;


/**
 * 学生请假
 * 
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface XueshengqingjiaDao extends BaseMapper<XueshengqingjiaEntity> {
	
	List<XueshengqingjiaVO> selectListVO(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
	
	XueshengqingjiaVO selectVO(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
	
	List<XueshengqingjiaView> selectListView(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);

	List<XueshengqingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
	
	XueshengqingjiaView selectView(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
	
}
