package com.lagou.rabbitdemo.controller;

import com.lagou.rabbitdemo.dto.ResponseData;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class MyExceptionCo {

    /**
     * 参数校验异常
     * @param ex 传参异常
     * @return  铺抓到的异常信息
     */
    @ResponseBody
    @ExceptionHandler( MethodArgumentNotValidException.class )
    public ResponseData<Map<String,String>> errorHandler(MethodArgumentNotValidException ex) {

        BindingResult bindingResult = ex.getBindingResult();
        Map<String, String> map = new HashMap<>();
        for (FieldError fieldError:bindingResult.getFieldErrors()) {
            map.put( fieldError.getDefaultMessage(),fieldError.getField() );
        }

        return ResponseData.FAILURE(map);
    }

}