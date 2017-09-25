package com.club.web.model;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hm_menu_submenu
 */
public class HmMenuSubmenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.id
     *
     * @FieldComment 主键id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.title
     *
     * @FieldComment 菜单名称
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.url
     *
     * @FieldComment 菜单目标路径
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.remarks
     *
     * @FieldComment 备注
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.v_out_id
     *
     * @FieldComment 子菜单外键id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private Integer vOutId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.sorting
     *
     * @FieldComment 排序
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String sorting;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.status
     *
     * @FieldComment 状态 1.启用,0未启用
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.type
     *
     * @FieldComment 菜单类型 1.前台 2.后台
     *
     * @mbggenerated Mon Sep 25 14:51:52 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.create_time
     *
     * @FieldComment 创建时间
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.update_time
     *
     * @FieldComment 更新时间
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.is_delete
     *
     * @FieldComment 是否删除 1.正常,0.删除
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.admin_id
     *
     * @FieldComment 操作人id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hm_menu_submenu.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    private String adminName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.id
     *
     * @FieldComment 主键id
     *
     * @return the value of hm_menu_submenu.id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.id
     *
     * @FieldComment 主键id
     *
     * @param id the value for hm_menu_submenu.id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.title
     *
     * @FieldComment 菜单名称
     *
     * @return the value of hm_menu_submenu.title
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.title
     *
     * @FieldComment 菜单名称
     *
     * @param title the value for hm_menu_submenu.title
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.url
     *
     * @FieldComment 菜单目标路径
     *
     * @return the value of hm_menu_submenu.url
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.url
     *
     * @FieldComment 菜单目标路径
     *
     * @param url the value for hm_menu_submenu.url
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.remarks
     *
     * @FieldComment 备注
     *
     * @return the value of hm_menu_submenu.remarks
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.remarks
     *
     * @FieldComment 备注
     *
     * @param remarks the value for hm_menu_submenu.remarks
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.v_out_id
     *
     * @FieldComment 子菜单外键id
     *
     * @return the value of hm_menu_submenu.v_out_id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public Integer getvOutId() {
        return vOutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.v_out_id
     *
     * @FieldComment 子菜单外键id
     *
     * @param vOutId the value for hm_menu_submenu.v_out_id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setvOutId(Integer vOutId) {
        this.vOutId = vOutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.sorting
     *
     * @FieldComment 排序
     *
     * @return the value of hm_menu_submenu.sorting
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getSorting() {
        return sorting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.sorting
     *
     * @FieldComment 排序
     *
     * @param sorting the value for hm_menu_submenu.sorting
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setSorting(String sorting) {
        this.sorting = sorting == null ? null : sorting.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.status
     *
     * @FieldComment 状态 1.启用,0未启用
     *
     * @return the value of hm_menu_submenu.status
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.status
     *
     * @FieldComment 状态 1.启用,0未启用
     *
     * @param status the value for hm_menu_submenu.status
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.type
     *
     * @FieldComment 菜单类型 1.前台 2.后台
     *
     * @return the value of hm_menu_submenu.type
     *
     * @mbggenerated Mon Sep 25 14:51:52 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.type
     *
     * @FieldComment 菜单类型 1.前台 2.后台
     *
     * @param type the value for hm_menu_submenu.type
     *
     * @mbggenerated Mon Sep 25 14:51:52 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.create_time
     *
     * @FieldComment 创建时间
     *
     * @return the value of hm_menu_submenu.create_time
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.create_time
     *
     * @FieldComment 创建时间
     *
     * @param createTime the value for hm_menu_submenu.create_time
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.update_time
     *
     * @FieldComment 更新时间
     *
     * @return the value of hm_menu_submenu.update_time
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.update_time
     *
     * @FieldComment 更新时间
     *
     * @param updateTime the value for hm_menu_submenu.update_time
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.is_delete
     *
     * @FieldComment 是否删除 1.正常,0.删除
     *
     * @return the value of hm_menu_submenu.is_delete
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.is_delete
     *
     * @FieldComment 是否删除 1.正常,0.删除
     *
     * @param isDelete the value for hm_menu_submenu.is_delete
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.admin_id
     *
     * @FieldComment 操作人id
     *
     * @return the value of hm_menu_submenu.admin_id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.admin_id
     *
     * @FieldComment 操作人id
     *
     * @param adminId the value for hm_menu_submenu.admin_id
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hm_menu_submenu.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @return the value of hm_menu_submenu.admin_name
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hm_menu_submenu.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @param adminName the value for hm_menu_submenu.admin_name
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }
}