package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengqingjiaDao;
import com.entity.XueshengqingjiaEntity;
import com.service.XueshengqingjiaService;
import com.entity.vo.XueshengqingjiaVO;
import com.entity.view.XueshengqingjiaView;

@Service("xueshengqingjiaService")
public class XueshengqingjiaServiceImpl extends ServiceImpl<XueshengqingjiaDao, XueshengqingjiaEntity> implements XueshengqingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengqingjiaEntity> page = this.selectPage(
                new Query<XueshengqingjiaEntity>(params).getPage(),
                new EntityWrapper<XueshengqingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengqingjiaEntity> wrapper) {
		  Page<XueshengqingjiaView> page =new Query<XueshengqingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengqingjiaVO> selectListVO(Wrapper<XueshengqingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengqingjiaVO selectVO(Wrapper<XueshengqingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengqingjiaView> selectListView(Wrapper<XueshengqingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengqingjiaView selectView(Wrapper<XueshengqingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
