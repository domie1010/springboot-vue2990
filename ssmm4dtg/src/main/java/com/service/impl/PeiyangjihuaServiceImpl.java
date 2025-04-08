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


import com.dao.PeiyangjihuaDao;
import com.entity.PeiyangjihuaEntity;
import com.service.PeiyangjihuaService;
import com.entity.vo.PeiyangjihuaVO;
import com.entity.view.PeiyangjihuaView;

@Service("peiyangjihuaService")
public class PeiyangjihuaServiceImpl extends ServiceImpl<PeiyangjihuaDao, PeiyangjihuaEntity> implements PeiyangjihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeiyangjihuaEntity> page = this.selectPage(
                new Query<PeiyangjihuaEntity>(params).getPage(),
                new EntityWrapper<PeiyangjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeiyangjihuaEntity> wrapper) {
		  Page<PeiyangjihuaView> page =new Query<PeiyangjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeiyangjihuaVO> selectListVO(Wrapper<PeiyangjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeiyangjihuaVO selectVO(Wrapper<PeiyangjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeiyangjihuaView> selectListView(Wrapper<PeiyangjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeiyangjihuaView selectView(Wrapper<PeiyangjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
