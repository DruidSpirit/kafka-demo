package com.lagou.rabbitdemo.dto.req;

import lombok.Data;

@Data
public class SubmitOrderReq {

    /**
     * 商品编号
     */
    private Long merchandiseId;

    /**
     * 产品数量
     */
    private Integer count;
}
