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


import com.dao.DingdanpaiduiDao;
import com.entity.DingdanpaiduiEntity;
import com.service.DingdanpaiduiService;
import com.entity.vo.DingdanpaiduiVO;
import com.entity.view.DingdanpaiduiView;

@Service("dingdanpaiduiService")
public class DingdanpaiduiServiceImpl extends ServiceImpl<DingdanpaiduiDao, DingdanpaiduiEntity> implements DingdanpaiduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanpaiduiEntity> page = this.selectPage(
                new Query<DingdanpaiduiEntity>(params).getPage(),
                new EntityWrapper<DingdanpaiduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanpaiduiEntity> wrapper) {
		  Page<DingdanpaiduiView> page =new Query<DingdanpaiduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanpaiduiVO> selectListVO(Wrapper<DingdanpaiduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanpaiduiVO selectVO(Wrapper<DingdanpaiduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanpaiduiView> selectListView(Wrapper<DingdanpaiduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanpaiduiView selectView(Wrapper<DingdanpaiduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
