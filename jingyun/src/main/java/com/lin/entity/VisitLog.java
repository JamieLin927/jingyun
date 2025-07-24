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
 * 访问日志表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="VisitLog对象", description="访问日志表")
public class VisitLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "访问ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "会话ID")
    private String sessionId;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "IP地址")
    private String ipAddress;

    @ApiModelProperty(value = "浏览器信息")
    private String userAgent;

    @ApiModelProperty(value = "来源页面")
    private String referer;

    @ApiModelProperty(value = "请求URI")
    private String requestUri;

    @ApiModelProperty(value = "请求方法")
    private String requestMethod;

    @ApiModelProperty(value = "状态码")
    private Integer statusCode;

    @ApiModelProperty(value = "响应时间(毫秒)")
    private Integer responseTime;

    @ApiModelProperty(value = "设备类型")
    private String deviceType;

    @ApiModelProperty(value = "操作系统")
    private String os;

    @ApiModelProperty(value = "浏览器")
    private String browser;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "地区")
    private String region;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "访问时间")
    private LocalDateTime visitTime;


}
