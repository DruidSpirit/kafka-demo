package com.lagou.rabbitdemo.dto.req;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class UserReq {

    @NotEmpty(message = "用户名称不能为空")
    private String username;

    @NotEmpty(message = "用户密码不能为空")
    private String password;

}
