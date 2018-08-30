package com.uhope.uip.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sm_user")
public class SmUser implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 统一用户中心中的用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 所属行政区域ID
     */
    @Column(name = "region_id")
    private Long regionId;

    /**
     * 状态：1（待审核）、2（审核未通过）、3（正常）、4（禁用）、
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 创建人id
     */
    @Column(name = "creator_id")
    private String creatorId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人id
     */
    @Column(name = "modifier_id")
    private String modifierId;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 有效时间
     */
    @Column(name = "EFFECTTIME")
    private Date effecttime;

    /**
     * 排序号
     */
    @Column(name = "SORT_ORDER")
    private Double sortOrder;

    /**
     * 用户类型
     */
    @Column(name = "USERTYPE")
    private Integer usertype;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取统一用户中心中的用户id
     *
     * @return user_id - 统一用户中心中的用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置统一用户中心中的用户id
     *
     * @param userId 统一用户中心中的用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取所属行政区域ID
     *
     * @return region_id - 所属行政区域ID
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * 设置所属行政区域ID
     *
     * @param regionId 所属行政区域ID
     */
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取状态：1（待审核）、2（审核未通过）、3（正常）、4（禁用）、
     *
     * @return STATUS - 状态：1（待审核）、2（审核未通过）、3（正常）、4（禁用）、
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：1（待审核）、2（审核未通过）、3（正常）、4（禁用）、
     *
     * @param status 状态：1（待审核）、2（审核未通过）、3（正常）、4（禁用）、
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建人id
     *
     * @return creator_id - 创建人id
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人id
     *
     * @return modifier_id - 修改人id
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * 设置修改人id
     *
     * @param modifierId 修改人id
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取有效时间
     *
     * @return EFFECTTIME - 有效时间
     */
    public Date getEffecttime() {
        return effecttime;
    }

    /**
     * 设置有效时间
     *
     * @param effecttime 有效时间
     */
    public void setEffecttime(Date effecttime) {
        this.effecttime = effecttime;
    }

    /**
     * 获取排序号
     *
     * @return SORT_ORDER - 排序号
     */
    public Double getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序号
     *
     * @param sortOrder 排序号
     */
    public void setSortOrder(Double sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取用户类型
     *
     * @return USERTYPE - 用户类型
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * 设置用户类型
     *
     * @param usertype 用户类型
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }
}