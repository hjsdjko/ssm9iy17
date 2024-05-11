package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangdingdanView;


/**
 * 处方订单
 *
 * @author 
 * @email 
 * @date 2022-04-21 17:44:58
 */
public interface ChufangdingdanService extends IService<ChufangdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangdingdanVO> selectListVO(Wrapper<ChufangdingdanEntity> wrapper);
   	
   	ChufangdingdanVO selectVO(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
   	
   	List<ChufangdingdanView> selectListView(Wrapper<ChufangdingdanEntity> wrapper);
   	
   	ChufangdingdanView selectView(@Param("ew") Wrapper<ChufangdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangdingdanEntity> wrapper);
   	

}

