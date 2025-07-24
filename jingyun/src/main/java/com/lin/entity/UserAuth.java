package com.lin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 第三方登录认证表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserAuth对象", description="第三方登录认证表")
public class UserAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "认证ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "关联用户ID")
    private Long userId;

    @ApiModelProperty(value = "认证类型")
    private String identityType;

    @ApiModelProperty(value = "第三方唯一标识")
    private String identifier;

    @ApiModelProperty(value = "第三方凭证(如access_token)")
    private String credential;

    @ApiModelProperty(value = "绑定时间")
    private LocalDateTime bindTime;

    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "第三方用户信息(JSON格式)")
    private String profile;


}
