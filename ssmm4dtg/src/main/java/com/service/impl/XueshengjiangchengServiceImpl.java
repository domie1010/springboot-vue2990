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


import com.dao.XueshengjiangchengDao;
import com.entity.XueshengjiangchengEntity;
import com.service.XueshengjiangchengService;
import com.entity.vo.XueshengjiangchengVO;
import com.entity.view.XueshengjiangchengView;

@Service("xueshengjiangchengService")
public class XueshengjiangchengServiceImpl extends ServiceImpl<XueshengjiangchengDao, XueshengjiangchengEntity> implements XueshengjiangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjiangchengEntity> page = this.selectPage(
                new Query<XueshengjiangchengEntity>(params).getPage(),
                new EntityWrapper<XueshengjiangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjiangchengEntity> wrapper) {
		  Page<XueshengjiangchengView> page =new Query<XueshengjiangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjiangchengVO> selectListVO(Wrapper<XueshengjiangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjiangchengVO selectVO(Wrapper<XueshengjiangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjiangchengView> selectListView(Wrapper<XueshengjiangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjiangchengView selectView(Wrapper<XueshengjiangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
