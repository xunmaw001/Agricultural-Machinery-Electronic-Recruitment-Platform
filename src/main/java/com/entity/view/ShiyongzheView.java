package com.entity.view;

import com.entity.ShiyongzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 使用者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 15:38:13
 */
@TableName("shiyongzhe")
public class ShiyongzheView  extends ShiyongzheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyongzheView(){
	}
 
 	public ShiyongzheView(ShiyongzheEntity shiyongzheEntity){
 	try {
			BeanUtils.copyProperties(this, shiyongzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
