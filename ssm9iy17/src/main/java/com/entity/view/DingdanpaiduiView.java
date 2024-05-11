package com.entity.view;

import com.entity.DingdanpaiduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单排队
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 17:44:59
 */
@TableName("dingdanpaidui")
public class DingdanpaiduiView  extends DingdanpaiduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanpaiduiView(){
	}
 
 	public DingdanpaiduiView(DingdanpaiduiEntity dingdanpaiduiEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanpaiduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
