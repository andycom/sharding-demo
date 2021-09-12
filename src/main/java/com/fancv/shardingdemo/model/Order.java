package com.fancv.shardingdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel
public class Order {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "用户Id")
    private Long userId;

    private Long orderId;

    private String remark;

    private Date createTime;

}
