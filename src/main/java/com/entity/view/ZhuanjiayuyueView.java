package com.entity.view;

import com.entity.ZhuanjiayuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专家预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 22:51:29
 */
@TableName("zhuanjiayuyue")
public class ZhuanjiayuyueView  extends ZhuanjiayuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanjiayuyueView(){
	}
 
 	public ZhuanjiayuyueView(ZhuanjiayuyueEntity zhuanjiayuyueEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanjiayuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
