package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxibanjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxibanjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxibanjiView;


/**
 * 院系班级
 *
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface YuanxibanjiService extends IService<YuanxibanjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxibanjiVO> selectListVO(Wrapper<YuanxibanjiEntity> wrapper);
   	
   	YuanxibanjiVO selectVO(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
   	
   	List<YuanxibanjiView> selectListView(Wrapper<YuanxibanjiEntity> wrapper);
   	
   	YuanxibanjiView selectView(@Param("ew") Wrapper<YuanxibanjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxibanjiEntity> wrapper);
   	
}

