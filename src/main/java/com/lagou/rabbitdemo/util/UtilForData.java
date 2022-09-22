package com.lagou.rabbitdemo.util;

import lombok.extern.log4j.Log4j2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

@Log4j2
public class UtilForData {

    /**
     * 根据属性值去重
     * @param keyExtractor 传入生成key值策略的的函数表达式
     * @param <T> 去重的类
     * @return boolean ture 不存在重复值  false 存在重复值
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    /**
     * 通过状态码找到其对应的枚举值(注意状态码值必须在枚举中唯一，不然它会选择找到的第一条)
     * @param ts        枚举中的各个实例
     * @param function  获取比较码值的方法
     * @param r         状态码值
     * @return          枚举实例
     */
    public static <T extends Enum, R> T getEnumByCode ( T[] ts, Function<T,R> function, R r ) {

        for ( T t : ts ) {
            if ( function.apply(t).equals(r)) return t;
        }
        log.warn("传入的状态码{}找不到对应的枚举",r);

        return null;
    }
}
