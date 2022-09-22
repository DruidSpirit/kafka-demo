package com.lagou.rabbitdemo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatusEnum {

    /**
     * 未付款
     */
    NO_PAY(0),

    /**
     * 已付款
     */
    HAS_PAY(1),

    /**
     * 逾期未付款
     */
    OVERDUE_NOT_PAY(2),

    ;

    private final Integer code;
}
