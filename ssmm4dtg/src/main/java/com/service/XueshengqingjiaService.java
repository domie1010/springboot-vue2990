package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengqingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengqingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengqingjiaView;


/**
 * 学生请假
 *
 * @author 
 * @email 
 * @date 2021-06-02 12:21:47
 */
public interface XueshengqingjiaService extends IService<XueshengqingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengqingjiaVO> selectListVO(Wrapper<XueshengqingjiaEntity> wrapper);
   	
   	XueshengqingjiaVO selectVO(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
   	
   	List<XueshengqingjiaView> selectListView(Wrapper<XueshengqingjiaEntity> wrapper);
   	
   	XueshengqingjiaView selectView(@Param("ew") Wrapper<XueshengqingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengqingjiaEntity> wrapper);
   	
}

