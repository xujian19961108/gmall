package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款信息
 * 
 * @author canjian
 * @email 
 * @date 2021-12-25 20:05:15
 */
@ApiModel
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 退款的订单
	 */
	@ApiModelProperty(name = "orderReturnId",value = "退款的订单")
	private Long orderReturnId;
	/**
	 * 退款金额
	 */
	@ApiModelProperty(name = "refund",value = "退款金额")
	private BigDecimal refund;
	/**
	 * 退款交易流水号
	 */
	@ApiModelProperty(name = "refundSn",value = "退款交易流水号")
	private String refundSn;
	/**
	 * 退款状态
	 */
	@ApiModelProperty(name = "refundStatus",value = "退款状态")
	private Integer refundStatus;
	/**
	 * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	 */
	@ApiModelProperty(name = "refundChannel",value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
	private Integer refundChannel;
	/**
	 * 
	 */
	@ApiModelProperty(name = "refundContent",value = "")
	private String refundContent;

}
