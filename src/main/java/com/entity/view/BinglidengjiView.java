package com.entity.view;

import com.entity.BinglidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病历登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
@TableName("binglidengji")
public class BinglidengjiView  extends BinglidengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BinglidengjiView(){
	}
 
 	public BinglidengjiView(BinglidengjiEntity binglidengjiEntity){
 	try {
			BeanUtils.copyProperties(this, binglidengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
