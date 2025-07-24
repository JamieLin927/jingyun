package com.lin.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 角色权限关联表
 * </p>
 *
 * @author YourName
 * @since 2025-07-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RolePermission对象", description="角色权限关联表")
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
    private Integer roleId;

    @ApiModelProperty(value = "权限ID")
    private Integer permissionId;


}
