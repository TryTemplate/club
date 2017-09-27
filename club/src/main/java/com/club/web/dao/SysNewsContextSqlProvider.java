package com.club.web.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.club.web.model.SysNewsContext;

public class SysNewsContextSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The combine SQL for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    public String insertSelective(SysNewsContext record) {
        BEGIN();
        INSERT_INTO("sys_news_context");
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            VALUES("context", "#{context,jdbcType=VARCHAR}");
        }
        
        if (record.getLabel() != null) {
            VALUES("label", "#{label,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getIsDelete() != null) {
            VALUES("is_delete", "#{isDelete,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminId() != null) {
            VALUES("admin_id", "#{adminId,jdbcType=INTEGER}");
        }
        
        if (record.getAdminName() != null) {
            VALUES("admin_name", "#{adminName,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The combine SQL for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    public String updateByPrimaryKeySelective(SysNewsContext record) {
        BEGIN();
        UPDATE("sys_news_context");
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            SET("context = #{context,jdbcType=VARCHAR}");
        }
        
        if (record.getLabel() != null) {
            SET("label = #{label,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getIsDelete() != null) {
            SET("is_delete = #{isDelete,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdminId() != null) {
            SET("admin_id = #{adminId,jdbcType=INTEGER}");
        }
        
        if (record.getAdminName() != null) {
            SET("admin_name = #{adminName,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}