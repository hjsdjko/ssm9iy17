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


import com.dao.ChufangdingdanDao;
import com.entity.ChufangdingdanEntity;
import com.service.ChufangdingdanService;
import com.entity.vo.ChufangdingdanVO;
import com.entity.view.ChufangdingdanView;

@Service("chufangdingdanService")
public class ChufangdingdanServiceImpl extends ServiceImpl<ChufangdingdanDao, ChufangdingdanEntity> implements ChufangdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangdingdanEntity> page = this.selectPage(
                new Query<ChufangdingdanEntity>(params).getPage(),
                new EntityWrapper<ChufangdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangdingdanEntity> wrapper) {
		  Page<ChufangdingdanView> page =new Query<ChufangdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufangdingdanVO> selectListVO(Wrapper<ChufangdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangdingdanVO selectVO(Wrapper<ChufangdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangdingdanView> selectListView(Wrapper<ChufangdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangdingdanView selectView(Wrapper<ChufangdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
