package com.lin.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 前台用户信息表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="FrontendUser对象", description="前台用户信息表")
public class FrontendUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关联用户ID")
    private Long userId;

    @ApiModelProperty(value = "显示名称")
    private String displayName;

    @ApiModelProperty(value = "社交链接(JSON格式)")
    private String socialLinks;

    @ApiModelProperty(value = "通知偏好设置")
    private String notificationPrefs;

    @ApiModelProperty(value = "评论数")
    private Integer commentCount;

    @ApiModelProperty(value = "点赞数")
    private Integer likeCount;


}
