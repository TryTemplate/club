package com.club.web.model;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user_admin
 */
public class SysUserAdmin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.id
     *
     * @FieldComment 主键id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.account
     *
     * @FieldComment 账号
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.user_id
     *
     * @FieldComment 用户id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.user_name
     *
     * @FieldComment 用户昵称
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.user_real_name
     *
     * @FieldComment 真实姓名
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String userRealName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.sex
     *
     * @FieldComment 性别 1.男,2.女,3.其他
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.customer_type
     *
     * @FieldComment 用户类型 1.用户 2.后台管理
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String customerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.avatar_path
     *
     * @FieldComment 头像路径
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String avatarPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.status
     *
     * @FieldComment 状态 1.正常,0.冻结
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.is_delete
     *
     * @FieldComment 是否是否删除 1.正常,0.删除
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.create_time
     *
     * @FieldComment 创建时间
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.update_time
     *
     * @FieldComment 更新时间
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.admin_id
     *
     * @FieldComment 操作人姓名
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_admin.password
     *
     * @FieldComment 密码
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.id
     *
     * @FieldComment 主键id
     *
     * @return the value of sys_user_admin.id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.id
     *
     * @FieldComment 主键id
     *
     * @param id the value for sys_user_admin.id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.account
     *
     * @FieldComment 账号
     *
     * @return the value of sys_user_admin.account
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.account
     *
     * @FieldComment 账号
     *
     * @param account the value for sys_user_admin.account
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.user_id
     *
     * @FieldComment 用户id
     *
     * @return the value of sys_user_admin.user_id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.user_id
     *
     * @FieldComment 用户id
     *
     * @param userId the value for sys_user_admin.user_id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.user_name
     *
     * @FieldComment 用户昵称
     *
     * @return the value of sys_user_admin.user_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.user_name
     *
     * @FieldComment 用户昵称
     *
     * @param userName the value for sys_user_admin.user_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.user_real_name
     *
     * @FieldComment 真实姓名
     *
     * @return the value of sys_user_admin.user_real_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.user_real_name
     *
     * @FieldComment 真实姓名
     *
     * @param userRealName the value for sys_user_admin.user_real_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.sex
     *
     * @FieldComment 性别 1.男,2.女,3.其他
     *
     * @return the value of sys_user_admin.sex
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.sex
     *
     * @FieldComment 性别 1.男,2.女,3.其他
     *
     * @param sex the value for sys_user_admin.sex
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.customer_type
     *
     * @FieldComment 用户类型 1.用户 2.后台管理
     *
     * @return the value of sys_user_admin.customer_type
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.customer_type
     *
     * @FieldComment 用户类型 1.用户 2.后台管理
     *
     * @param customerType the value for sys_user_admin.customer_type
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.avatar_path
     *
     * @FieldComment 头像路径
     *
     * @return the value of sys_user_admin.avatar_path
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getAvatarPath() {
        return avatarPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.avatar_path
     *
     * @FieldComment 头像路径
     *
     * @param avatarPath the value for sys_user_admin.avatar_path
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath == null ? null : avatarPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.status
     *
     * @FieldComment 状态 1.正常,0.冻结
     *
     * @return the value of sys_user_admin.status
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.status
     *
     * @FieldComment 状态 1.正常,0.冻结
     *
     * @param status the value for sys_user_admin.status
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.is_delete
     *
     * @FieldComment 是否是否删除 1.正常,0.删除
     *
     * @return the value of sys_user_admin.is_delete
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.is_delete
     *
     * @FieldComment 是否是否删除 1.正常,0.删除
     *
     * @param isDelete the value for sys_user_admin.is_delete
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.create_time
     *
     * @FieldComment 创建时间
     *
     * @return the value of sys_user_admin.create_time
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.create_time
     *
     * @FieldComment 创建时间
     *
     * @param createTime the value for sys_user_admin.create_time
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.update_time
     *
     * @FieldComment 更新时间
     *
     * @return the value of sys_user_admin.update_time
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.update_time
     *
     * @FieldComment 更新时间
     *
     * @param updateTime the value for sys_user_admin.update_time
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.admin_id
     *
     * @FieldComment 操作人姓名
     *
     * @return the value of sys_user_admin.admin_id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.admin_id
     *
     * @FieldComment 操作人姓名
     *
     * @param adminId the value for sys_user_admin.admin_id
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @return the value of sys_user_admin.admin_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.admin_name
     *
     * @FieldComment 操作人姓名
     *
     * @param adminName the value for sys_user_admin.admin_name
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_admin.password
     *
     * @FieldComment 密码
     *
     * @return the value of sys_user_admin.password
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_admin.password
     *
     * @FieldComment 密码
     *
     * @param password the value for sys_user_admin.password
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }
}