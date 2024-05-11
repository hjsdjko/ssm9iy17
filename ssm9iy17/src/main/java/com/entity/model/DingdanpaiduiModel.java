package com.entity.model;

import com.entity.DingdanpaiduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单排队
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-21 17:44:59
 */
public class DingdanpaiduiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 诊断结果
	 */
	
	private String zhenduanjieguo;
		
	/**
	 * 处方名称
	 */
	
	private String chufangmingcheng;
		
	/**
	 * 处方图片
	 */
	
	private String chufangtupian;
		
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 医嘱
	 */
	
	private String yizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 订单号码
	 */
	
	private String dingdanhaoma;
		
	/**
	 * 当前号码
	 */
	
	private String dangqianhaoma;
		
	/**
	 * 预计时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yujishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 推送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuisongshijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：诊断结果
	 */
	 
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
				
	
	/**
	 * 设置：处方名称
	 */
	 
	public void setChufangmingcheng(String chufangmingcheng) {
		this.chufangmingcheng = chufangmingcheng;
	}
	
	/**
	 * 获取：处方名称
	 */
	public String getChufangmingcheng() {
		return chufangmingcheng;
	}
				
	
	/**
	 * 设置：处方图片
	 */
	 
	public void setChufangtupian(String chufangtupian) {
		this.chufangtupian = chufangtupian;
	}
	
	/**
	 * 获取：处方图片
	 */
	public String getChufangtupian() {
		return chufangtupian;
	}
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：医嘱
	 */
	 
	public void setYizhu(String yizhu) {
		this.yizhu = yizhu;
	}
	
	/**
	 * 获取：医嘱
	 */
	public String getYizhu() {
		return yizhu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：订单号码
	 */
	 
	public void setDingdanhaoma(String dingdanhaoma) {
		this.dingdanhaoma = dingdanhaoma;
	}
	
	/**
	 * 获取：订单号码
	 */
	public String getDingdanhaoma() {
		return dingdanhaoma;
	}
				
	
	/**
	 * 设置：当前号码
	 */
	 
	public void setDangqianhaoma(String dangqianhaoma) {
		this.dangqianhaoma = dangqianhaoma;
	}
	
	/**
	 * 获取：当前号码
	 */
	public String getDangqianhaoma() {
		return dangqianhaoma;
	}
				
	
	/**
	 * 设置：预计时间
	 */
	 
	public void setYujishijian(Date yujishijian) {
		this.yujishijian = yujishijian;
	}
	
	/**
	 * 获取：预计时间
	 */
	public Date getYujishijian() {
		return yujishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：推送时间
	 */
	 
	public void setTuisongshijian(Date tuisongshijian) {
		this.tuisongshijian = tuisongshijian;
	}
	
	/**
	 * 获取：推送时间
	 */
	public Date getTuisongshijian() {
		return tuisongshijian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
