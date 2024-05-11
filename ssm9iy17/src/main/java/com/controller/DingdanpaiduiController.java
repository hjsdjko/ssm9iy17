package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DingdanpaiduiEntity;
import com.entity.view.DingdanpaiduiView;

import com.service.DingdanpaiduiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 订单排队
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-21 17:44:59
 */
@RestController
@RequestMapping("/dingdanpaidui")
public class DingdanpaiduiController {
    @Autowired
    private DingdanpaiduiService dingdanpaiduiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DingdanpaiduiEntity dingdanpaidui, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			dingdanpaidui.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			dingdanpaidui.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdanpaiduiEntity> ew = new EntityWrapper<DingdanpaiduiEntity>();
		PageUtils page = dingdanpaiduiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanpaidui), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DingdanpaiduiEntity dingdanpaidui, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			dingdanpaidui.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			dingdanpaidui.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdanpaiduiEntity> ew = new EntityWrapper<DingdanpaiduiEntity>();
		PageUtils page = dingdanpaiduiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanpaidui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DingdanpaiduiEntity dingdanpaidui){
       	EntityWrapper<DingdanpaiduiEntity> ew = new EntityWrapper<DingdanpaiduiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dingdanpaidui, "dingdanpaidui")); 
        return R.ok().put("data", dingdanpaiduiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DingdanpaiduiEntity dingdanpaidui){
        EntityWrapper< DingdanpaiduiEntity> ew = new EntityWrapper< DingdanpaiduiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dingdanpaidui, "dingdanpaidui")); 
		DingdanpaiduiView dingdanpaiduiView =  dingdanpaiduiService.selectView(ew);
		return R.ok("查询订单排队成功").put("data", dingdanpaiduiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DingdanpaiduiEntity dingdanpaidui = dingdanpaiduiService.selectById(id);
        return R.ok().put("data", dingdanpaidui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DingdanpaiduiEntity dingdanpaidui = dingdanpaiduiService.selectById(id);
        return R.ok().put("data", dingdanpaidui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DingdanpaiduiEntity dingdanpaidui, HttpServletRequest request){
    	dingdanpaidui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdanpaidui);

        dingdanpaiduiService.insert(dingdanpaidui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DingdanpaiduiEntity dingdanpaidui, HttpServletRequest request){
    	dingdanpaidui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdanpaidui);
    	dingdanpaidui.setUserid((Long)request.getSession().getAttribute("userId"));

        dingdanpaiduiService.insert(dingdanpaidui);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DingdanpaiduiEntity dingdanpaidui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dingdanpaidui);
        dingdanpaiduiService.updateById(dingdanpaidui);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dingdanpaiduiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DingdanpaiduiEntity> wrapper = new EntityWrapper<DingdanpaiduiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dingdanpaiduiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
