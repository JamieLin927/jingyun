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
 * 操作日志表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OperationLog对象", description="操作日志表")
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "操作用户ID")
    private Long userId;

    @ApiModelProperty(value = "操作类型")
    private String operation;

    @ApiModelProperty(value = "操作对象")
    private String target;

    @ApiModelProperty(value = "操作详情")
    private String detail;

    @ApiModelProperty(value = "IP地址")
    private String ipAddress;

    @ApiModelProperty(value = "浏览器信息")
    private String userAgent;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime createdAt;


}
