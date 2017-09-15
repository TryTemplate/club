package com.club.web.model;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_files
 */
public class SysFiles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.id
     *
     * @FieldComment 主键id
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.use_id
     *
     * @FieldComment 使用id (某表id)
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private Integer useId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.use_type
     *
     * @FieldComment 使用分类 (表示某表)
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private String useType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.name
     *
     * @FieldComment 文件名称
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.size
     *
     * @FieldComment 文件大小 单位(kb)
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private Double size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.type
     *
     * @FieldComment 文件类型
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.url_path
     *
     * @FieldComment 存储路径
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private String urlPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.create_time
     *
     * @FieldComment 创建时间
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.update_time
     *
     * @FieldComment 更新时间
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_files.is_delete
     *
     * @FieldComment 是否删除 1.正常,0删除
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    private String isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.id
     *
     * @FieldComment 主键id
     *
     * @return the value of sys_files.id
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.id
     *
     * @FieldComment 主键id
     *
     * @param id the value for sys_files.id
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.use_id
     *
     * @FieldComment 使用id (某表id)
     *
     * @return the value of sys_files.use_id
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public Integer getUseId() {
        return useId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.use_id
     *
     * @FieldComment 使用id (某表id)
     *
     * @param useId the value for sys_files.use_id
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.use_type
     *
     * @FieldComment 使用分类 (表示某表)
     *
     * @return the value of sys_files.use_type
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public String getUseType() {
        return useType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.use_type
     *
     * @FieldComment 使用分类 (表示某表)
     *
     * @param useType the value for sys_files.use_type
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.name
     *
     * @FieldComment 文件名称
     *
     * @return the value of sys_files.name
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.name
     *
     * @FieldComment 文件名称
     *
     * @param name the value for sys_files.name
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.size
     *
     * @FieldComment 文件大小 单位(kb)
     *
     * @return the value of sys_files.size
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public Double getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.size
     *
     * @FieldComment 文件大小 单位(kb)
     *
     * @param size the value for sys_files.size
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.type
     *
     * @FieldComment 文件类型
     *
     * @return the value of sys_files.type
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.type
     *
     * @FieldComment 文件类型
     *
     * @param type the value for sys_files.type
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.url_path
     *
     * @FieldComment 存储路径
     *
     * @return the value of sys_files.url_path
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.url_path
     *
     * @FieldComment 存储路径
     *
     * @param urlPath the value for sys_files.url_path
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath == null ? null : urlPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.create_time
     *
     * @FieldComment 创建时间
     *
     * @return the value of sys_files.create_time
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.create_time
     *
     * @FieldComment 创建时间
     *
     * @param createTime the value for sys_files.create_time
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.update_time
     *
     * @FieldComment 更新时间
     *
     * @return the value of sys_files.update_time
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.update_time
     *
     * @FieldComment 更新时间
     *
     * @param updateTime the value for sys_files.update_time
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_files.is_delete
     *
     * @FieldComment 是否删除 1.正常,0删除
     *
     * @return the value of sys_files.is_delete
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_files.is_delete
     *
     * @FieldComment 是否删除 1.正常,0删除
     *
     * @param isDelete the value for sys_files.is_delete
     *
     * @mbggenerated Wed Aug 09 10:05:14 CST 2017
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}