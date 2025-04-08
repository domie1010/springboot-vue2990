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


import com.dao.YuanxibanjiDao;
import com.entity.YuanxibanjiEntity;
import com.service.YuanxibanjiService;
import com.entity.vo.YuanxibanjiVO;
import com.entity.view.YuanxibanjiView;

@Service("yuanxibanjiService")
public class YuanxibanjiServiceImpl extends ServiceImpl<YuanxibanjiDao, YuanxibanjiEntity> implements YuanxibanjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxibanjiEntity> page = this.selectPage(
                new Query<YuanxibanjiEntity>(params).getPage(),
                new EntityWrapper<YuanxibanjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxibanjiEntity> wrapper) {
		  Page<YuanxibanjiView> page =new Query<YuanxibanjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxibanjiVO> selectListVO(Wrapper<YuanxibanjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxibanjiVO selectVO(Wrapper<YuanxibanjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxibanjiView> selectListView(Wrapper<YuanxibanjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxibanjiView selectView(Wrapper<YuanxibanjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
