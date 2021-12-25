package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author canjian
 * @email 
 * @date 2021-12-25 20:05:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
