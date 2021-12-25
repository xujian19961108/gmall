package com.atguigu.gmall.wms.controller;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.wms.entity.FreightTemplateEntity;
import com.atguigu.gmall.wms.service.FreightTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;




/**
 * 运费模板
 *
 * @author canjian
 * @email 
 * @date 2021-12-25 13:50:06
 */
@Api(tags = "运费模板 管理")
@RestController
@RequestMapping("wms/freighttemplate")
public class FreightTemplateController {
    @Autowired
    private FreightTemplateService freightTemplateService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('wms:freighttemplate:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = freightTemplateService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('wms:freighttemplate:info')")
    public Resp<FreightTemplateEntity> info(@PathVariable("id") Long id){
		FreightTemplateEntity freightTemplate = freightTemplateService.getById(id);

        return Resp.ok(freightTemplate);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('wms:freighttemplate:save')")
    public Resp<Object> save(@RequestBody FreightTemplateEntity freightTemplate){
		freightTemplateService.save(freightTemplate);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('wms:freighttemplate:update')")
    public Resp<Object> update(@RequestBody FreightTemplateEntity freightTemplate){
		freightTemplateService.updateById(freightTemplate);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('wms:freighttemplate:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		freightTemplateService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
