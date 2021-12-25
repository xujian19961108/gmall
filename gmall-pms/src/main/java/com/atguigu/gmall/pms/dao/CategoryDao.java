package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author canjian
 * @email 
 * @date 2021-12-26 00:48:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
