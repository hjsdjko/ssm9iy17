package com.dao;

import com.entity.ChufangdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangdingdanVO;
import com.entity.view.ChufangdingdanView;


/**
 * 处方订单
 * 
 * @author 
 * @email 
 * @date 2022-04-21 17:44:58
 */
public interface ChufangdingdanDao extends BaseMapper<ChufangdingdanEntity> {
	
	List<ChufangdingdanVO> selectListVO(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
	
	ChufangdingdanVO selectVO(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
	
	List<ChufangdingdanView> selectListView(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);

	List<ChufangdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
	
	ChufangdingdanView selectView(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
	

}
