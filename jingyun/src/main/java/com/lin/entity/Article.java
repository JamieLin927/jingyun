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
 * 文章表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Article对象", description="文章表")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "作者ID")
    private Long userId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "URL友好标题")
    private String slug;

    @ApiModelProperty(value = "内容(Markdown格式)")
    private String content;

    @ApiModelProperty(value = "HTML内容")
    private String htmlContent;

    @ApiModelProperty(value = "摘要")
    private String summary;

    @ApiModelProperty(value = "封面图URL")
    private String coverImage;

    @ApiModelProperty(value = "是否置顶(0:否,1:是)")
    private Boolean isTop;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "浏览数")
    private Integer viewCount;

    @ApiModelProperty(value = "评论数")
    private Integer commentCount;

    @ApiModelProperty(value = "点赞数")
    private Integer likeCount;

    @ApiModelProperty(value = "发布时间")
    private LocalDateTime publishedAt;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updatedAt;


}
