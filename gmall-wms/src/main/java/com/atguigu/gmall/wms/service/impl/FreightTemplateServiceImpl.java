package com.atguigu.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.wms.dao.FreightTemplateDao;
import com.atguigu.gmall.wms.entity.FreightTemplateEntity;
import com.atguigu.gmall.wms.service.FreightTemplateService;


@Service("freightTemplateService")
public class FreightTemplateServiceImpl extends ServiceImpl<FreightTemplateDao, FreightTemplateEntity> implements FreightTemplateService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FreightTemplateEntity> page = this.page(
                new Query<FreightTemplateEntity>().getPage(params),
                new QueryWrapper<FreightTemplateEntity>()
        );

        return new PageVo(page);
    }

}