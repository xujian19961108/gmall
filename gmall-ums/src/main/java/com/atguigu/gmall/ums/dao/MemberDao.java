package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author canjian
 * @email 
 * @date 2021-12-25 14:10:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
