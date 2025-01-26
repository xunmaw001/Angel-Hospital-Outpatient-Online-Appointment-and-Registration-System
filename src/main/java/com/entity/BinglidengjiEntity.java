package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病历登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
@TableName("binglidengji")
public class BinglidengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglidengjiEntity() {
		
	}
	
	public BinglidengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病历编号
	 */
					
	private String binglibianhao;
	
	/**
	 * 患者账号
	 */
					
	private String huanzhezhanghao;
	
	/**
	 * 患者姓名
	 */
					
	private String huanzhexingming;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	/**
	 * 主诉
	 */
					
	private String zhusu;
	
	/**
	 * 现病史
	 */
					
	private String xianbingshi;
	
	/**
	 * 既往史
	 */
					
	private String jiwangshi;
	
	/**
	 * 药敏史
	 */
					
	private String yaominshi;
	
	/**
	 * 诊断
	 */
					
	private String zhenduan;
	
	/**
	 * 治疗方案
	 */
					
	private String zhiliaofangan;
	
	/**
	 * 医嘱
	 */
					
	private String yizhu;
	
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病历编号
	 */
	public void setBinglibianhao(String binglibianhao) {
		this.binglibianhao = binglibianhao;
	}
	/**
	 * 获取：病历编号
	 */
	public String getBinglibianhao() {
		return binglibianhao;
	}
	/**
	 * 设置：患者账号
	 */
	public void setHuanzhezhanghao(String huanzhezhanghao) {
		this.huanzhezhanghao = huanzhezhanghao;
	}
	/**
	 * 获取：患者账号
	 */
	public String getHuanzhezhanghao() {
		return huanzhezhanghao;
	}
	/**
	 * 设置：患者姓名
	 */
	public void setHuanzhexingming(String huanzhexingming) {
		this.huanzhexingming = huanzhexingming;
	}
	/**
	 * 获取：患者姓名
	 */
	public String getHuanzhexingming() {
		return huanzhexingming;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：主诉
	 */
	public void setZhusu(String zhusu) {
		this.zhusu = zhusu;
	}
	/**
	 * 获取：主诉
	 */
	public String getZhusu() {
		return zhusu;
	}
	/**
	 * 设置：现病史
	 */
	public void setXianbingshi(String xianbingshi) {
		this.xianbingshi = xianbingshi;
	}
	/**
	 * 获取：现病史
	 */
	public String getXianbingshi() {
		return xianbingshi;
	}
	/**
	 * 设置：既往史
	 */
	public void setJiwangshi(String jiwangshi) {
		this.jiwangshi = jiwangshi;
	}
	/**
	 * 获取：既往史
	 */
	public String getJiwangshi() {
		return jiwangshi;
	}
	/**
	 * 设置：药敏史
	 */
	public void setYaominshi(String yaominshi) {
		this.yaominshi = yaominshi;
	}
	/**
	 * 获取：药敏史
	 */
	public String getYaominshi() {
		return yaominshi;
	}
	/**
	 * 设置：诊断
	 */
	public void setZhenduan(String zhenduan) {
		this.zhenduan = zhenduan;
	}
	/**
	 * 获取：诊断
	 */
	public String getZhenduan() {
		return zhenduan;
	}
	/**
	 * 设置：治疗方案
	 */
	public void setZhiliaofangan(String zhiliaofangan) {
		this.zhiliaofangan = zhiliaofangan;
	}
	/**
	 * 获取：治疗方案
	 */
	public String getZhiliaofangan() {
		return zhiliaofangan;
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
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
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
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}

}
