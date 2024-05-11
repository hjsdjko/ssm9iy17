package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanpaiduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanpaiduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanpaiduiView;


/**
 * 订单排队
 *
 * @author 
 * @email 
 * @date 2022-04-21 17:44:59
 */
public interface DingdanpaiduiService extends IService<DingdanpaiduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanpaiduiVO> selectListVO(Wrapper<DingdanpaiduiEntity> wrapper);
   	
   	DingdanpaiduiVO selectVO(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
   	
   	List<DingdanpaiduiView> selectListView(Wrapper<DingdanpaiduiEntity> wrapper);
   	
   	DingdanpaiduiView selectView(@Param("ew") Wrapper<DingdanpaiduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanpaiduiEntity> wrapper);
   	

}

