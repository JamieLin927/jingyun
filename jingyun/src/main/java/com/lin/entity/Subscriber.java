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
 * 邮件订阅表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Subscriber对象", description="邮件订阅表")
public class Subscriber implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订阅ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订阅邮箱")
    private String email;

    @ApiModelProperty(value = "关联用户ID")
    private Long userId;

    @ApiModelProperty(value = "订阅类型")
    private String subscribeType;

    @ApiModelProperty(value = "验证令牌")
    private String verificationToken;

    @ApiModelProperty(value = "是否验证(0:未验证,1:已验证)")
    private Boolean isVerified;

    @ApiModelProperty(value = "订阅时间")
    private LocalDateTime subscribeTime;

    @ApiModelProperty(value = "最后通知时间")
    private LocalDateTime lastNotifyTime;

    @ApiModelProperty(value = "取消订阅时间")
    private LocalDateTime unsubscribeTime;


}
