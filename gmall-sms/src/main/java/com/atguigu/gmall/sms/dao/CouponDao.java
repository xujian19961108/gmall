package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author canjian
 * @email 
 * @date 2021-12-26 00:53:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
