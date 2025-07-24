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
 * 友情链接表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Link对象", description="友情链接表")
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "链接ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "网站名称")
    private String name;

    @ApiModelProperty(value = "网站URL")
    private String url;

    @ApiModelProperty(value = "网站LOGO")
    private String logo;

    @ApiModelProperty(value = "网站描述")
    private String description;

    @ApiModelProperty(value = "链接分类")
    private String category;

    @ApiModelProperty(value = "是否显示(0:隐藏,1:显示)")
    private Boolean isVisible;

    @ApiModelProperty(value = "排序")
    private Integer order;

    @ApiModelProperty(value = "联系人邮箱")
    private String contactEmail;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updatedAt;


}
