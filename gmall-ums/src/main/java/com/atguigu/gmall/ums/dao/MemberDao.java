package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author canjian
 * @email 634192923@qq.com
 * @date 2019-12-03 18:54:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
