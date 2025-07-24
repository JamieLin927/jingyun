package com.lin.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章标签关系表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ArticleTag对象", description="文章标签关系表")
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章ID")
    private Long articleId;

    @ApiModelProperty(value = "标签ID")
    private Integer tagId;


}
