package com.lagou.rabbitdemo.controller;

import com.lagou.rabbitdemo.dto.ResponseData;
import com.lagou.rabbitdemo.entity.Merchandise;
import com.lagou.rabbitdemo.util.SnowIdGenerator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("merchandise")
@AllArgsConstructor
public class MerchandiseController {

    public static final List<Merchandise> merchandiseAllList = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            Merchandise merchandise = new Merchandise();
            merchandise.setId(SnowIdGenerator.generate());
            merchandise.setName("商品"+i);
            merchandise.setPrice(BigDecimal.valueOf(10.9+i));
            merchandiseAllList.add(merchandise);
        }
    }

    /**
     * 获取商品列表
     */
    @RequestMapping("getMerchandiseList")
    public ResponseData<List<Merchandise>> getMerchandiseList (){
       return ResponseData.SUCCESS(merchandiseAllList);
    }

    /**
     * 根据商品id获取商品详情
     */
    @RequestMapping("getMerchandiseById/{id}")
    public ResponseData<Merchandise> getMerchandiseById(@PathVariable Long id){

        return ResponseData.SUCCESS(
                merchandiseAllList.stream().filter(merchandise -> merchandise.getId().equals(id)).findFirst().orElseGet(Merchandise::new)
        );
    }
}
