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
 * 分类表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Category对象", description="分类表")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "URL友好名称")
    private String slug;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "父分类ID")
    private Integer parentId;

    @ApiModelProperty(value = "排序")
    private Integer order;

    @ApiModelProperty(value = "文章数")
    private Integer articleCount;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;


}
