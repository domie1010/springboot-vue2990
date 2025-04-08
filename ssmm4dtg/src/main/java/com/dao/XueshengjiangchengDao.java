package com.dao;

import com.entity.XueshengjiangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjiangchengVO;
import com.entity.view.XueshengjiangchengView;


/**
 * 学生奖惩
 * 
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface XueshengjiangchengDao extends BaseMapper<XueshengjiangchengEntity> {
	
	List<XueshengjiangchengVO> selectListVO(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
	
	XueshengjiangchengVO selectVO(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
	
	List<XueshengjiangchengView> selectListView(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);

	List<XueshengjiangchengView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
	
	XueshengjiangchengView selectView(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
	
}
