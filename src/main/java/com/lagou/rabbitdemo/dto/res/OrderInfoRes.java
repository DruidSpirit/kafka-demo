package com.lagou.rabbitdemo.dto.res;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderInfoRes {

    /**
     * 订单编号
     */
    private Long id;

    /**
     * 购买用户id
     */
    private Long purchaseId;

    /**
     * 购买人名称
     */
    private String purchaseName;

    /**
     * 商品编号
     */
    private Long merchandiseId;

    /**
     * 商品名称
     */
    private String merchandiseName;

    /**
     * 订单购买产品数量
     */
    private Integer merchandiseCount;

    /**
     * 应付款金额
     */
    private BigDecimal paymentAmount;

    /**
     * 应付款金额
     */
    private Integer paymentStatus;

    /**
     * 下单时间
     */
    private LocalDateTime createTime;
}
