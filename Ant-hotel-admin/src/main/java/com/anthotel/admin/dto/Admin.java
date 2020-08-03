package com.anthotel.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: Devhui
 * @Date: 2020/3/31 20:49
 * @Email: devhui@ihui.ink
 * @Version: 1.0
 */

@Data
@ApiModel(value = "账号登录类",description = "管理员账号登录")
public class Admin {
    @ApiModelProperty(value = "登录用户名")
    private String username;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "登录昵称")
    private String name;
    @ApiModelProperty(value = "头像地址")
    private String avatar;
}
