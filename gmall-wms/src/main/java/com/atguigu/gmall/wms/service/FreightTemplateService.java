package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.FreightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author canjian
 * @email 
 * @date 2021-12-25 13:50:06
 */
public interface FreightTemplateService extends IService<FreightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

