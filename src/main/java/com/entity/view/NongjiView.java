package com.entity.view;

import com.entity.NongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 15:38:13
 */
@TableName("nongji")
public class NongjiView  extends NongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongjiView(){
	}
 
 	public NongjiView(NongjiEntity nongjiEntity){
 	try {
			BeanUtils.copyProperties(this, nongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
