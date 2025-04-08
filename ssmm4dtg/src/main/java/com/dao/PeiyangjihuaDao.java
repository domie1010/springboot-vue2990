package com.dao;

import com.entity.PeiyangjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeiyangjihuaVO;
import com.entity.view.PeiyangjihuaView;


/**
 * 培养计划
 * 
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface PeiyangjihuaDao extends BaseMapper<PeiyangjihuaEntity> {
	
	List<PeiyangjihuaVO> selectListVO(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
	
	PeiyangjihuaVO selectVO(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
	
	List<PeiyangjihuaView> selectListView(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);

	List<PeiyangjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
	
	PeiyangjihuaView selectView(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
	
}
