package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeiyangjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeiyangjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeiyangjihuaView;


/**
 * 培养计划
 *
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface PeiyangjihuaService extends IService<PeiyangjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeiyangjihuaVO> selectListVO(Wrapper<PeiyangjihuaEntity> wrapper);
   	
   	PeiyangjihuaVO selectVO(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
   	
   	List<PeiyangjihuaView> selectListView(Wrapper<PeiyangjihuaEntity> wrapper);
   	
   	PeiyangjihuaView selectView(@Param("ew") Wrapper<PeiyangjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeiyangjihuaEntity> wrapper);
   	
}

