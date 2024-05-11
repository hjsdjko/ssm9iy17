package com.dao;

import com.entity.DingdanpaiduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanpaiduiVO;
import com.entity.view.DingdanpaiduiView;


/**
 * 订单排队
 * 
 * @author 
 * @email 
 * @date 2022-04-21 17:44:59
 */
public interface DingdanpaiduiDao extends BaseMapper<DingdanpaiduiEntity> {
	
	List<DingdanpaiduiVO> selectListVO(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
	
	DingdanpaiduiVO selectVO(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
	
	List<DingdanpaiduiView> selectListView(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);

	List<DingdanpaiduiView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
	
	DingdanpaiduiView selectView(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
	

}
