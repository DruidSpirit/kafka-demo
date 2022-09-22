package com.lagou.rabbitdemo.dto.req;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayMoneyReq {

    /**
     * 订单号
     */
    private Long orderId;

    /**
     * 付款金额
     */
    private BigDecimal payAmount;
}
