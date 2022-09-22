package com.lagou.rabbitdemo.entity;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Merchandise {

    private Long id;

    private String name;

    private BigDecimal price;
}
