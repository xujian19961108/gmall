package com.atguigu.gmall.sms.controller;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.sms.entity.CouponEntity;
import com.atguigu.gmall.sms.service.CouponService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;




/**
 * 优惠券信息
 *
 * @author canjian
 * @email 
 * @date 2021-12-26 00:53:48
 */
@Api(tags = "优惠券信息 管理")
@RestController
@RequestMapping("sms/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:coupon:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = couponService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:coupon:info')")
    public Resp<CouponEntity> info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return Resp.ok(coupon);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:coupon:save')")
    public Resp<Object> save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:coupon:update')")
    public Resp<Object> update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:coupon:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
