package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjiangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjiangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjiangchengView;


/**
 * 学生奖惩
 *
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface XueshengjiangchengService extends IService<XueshengjiangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjiangchengVO> selectListVO(Wrapper<XueshengjiangchengEntity> wrapper);
   	
   	XueshengjiangchengVO selectVO(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
   	
   	List<XueshengjiangchengView> selectListView(Wrapper<XueshengjiangchengEntity> wrapper);
   	
   	XueshengjiangchengView selectView(@Param("ew") Wrapper<XueshengjiangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjiangchengEntity> wrapper);
   	
}

