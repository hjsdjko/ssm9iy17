package com.entity.view;

import com.entity.ChufangdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 处方订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 17:44:58
 */
@TableName("chufangdingdan")
public class ChufangdingdanView  extends ChufangdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufangdingdanView(){
	}
 
 	public ChufangdingdanView(ChufangdingdanEntity chufangdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, chufangdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
