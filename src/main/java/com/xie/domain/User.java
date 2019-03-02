package com.xie.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户对象")
public class User {

    private Integer userId;

    @ApiModelProperty(value = "userName",required = true)
    private String userName;
    @ApiModelProperty(value = "password",required = true)
    private String password;
}
