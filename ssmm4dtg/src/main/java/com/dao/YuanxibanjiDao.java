package com.dao;

import com.entity.YuanxibanjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxibanjiVO;
import com.entity.view.YuanxibanjiView;


/**
 * 院系班级
 * 
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface YuanxibanjiDao extends BaseMapper<YuanxibanjiEntity> {
	
	List<YuanxibanjiVO> selectListVO(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
	
	YuanxibanjiVO selectVO(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
	
	List<YuanxibanjiView> selectListView(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);

	List<YuanxibanjiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
	
	YuanxibanjiView selectView(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
	
}
