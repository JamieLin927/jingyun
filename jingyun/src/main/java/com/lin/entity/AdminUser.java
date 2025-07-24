package com.lin.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户信息表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AdminUser对象", description="后台用户信息表")
public class AdminUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关联用户ID")
    private Long userId;

    @ApiModelProperty(value = "昵称/笔名")
    private String nickname;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "个人简介")
    private String bio;

    @ApiModelProperty(value = "个人网站")
    private String website;

    @ApiModelProperty(value = "是否超级管理员(0:否,1:是)")
    private Boolean isSuperAdmin;


}
