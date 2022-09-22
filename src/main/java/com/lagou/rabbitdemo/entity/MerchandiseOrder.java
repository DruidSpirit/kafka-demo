package com.lagou.rabbitdemo.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class MerchandiseOrder {

    private Long id;

    private Long purchaseId;

    private Long merchandiseId;

    private Integer merchandiseCount;

    private BigDecimal paymentAmount;

    private Integer paymentStatus;

    private LocalDateTime createTime;

}
