package com.club.web.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.club.web.model.HmMenuMainmenu;

public class HmMenuMainmenuSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_mainmenu
     * @param record  Model for table hm_menu_mainmenu
     * @return   The combine SQL for table hm_menu_mainmenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String insertSelective(HmMenuMainmenu record) {
        BEGIN();
        INSERT_INTO("hm_menu_mainmenu");
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            VALUES("remarks", "#{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getvOutId() != null) {
            VALUES("v_out_id", "#{vOutId,jdbcType=INTEGER}");
        }
        
        if (record.getSorting() != null) {
            VALUES("sorting", "#{sorting,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getMenuIcon() != null) {
            VALUES("menu_icon", "#{menuIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDelete() != null) {
            VALUES("is_delete", "#{isDelete,jdbcType=VARCHAR}");
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
     * This method corresponds to the database table hm_menu_mainmenu
     * @param record  Model for table hm_menu_mainmenu
     * @return   The combine SQL for table hm_menu_mainmenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    public String updateByPrimaryKeySelective(HmMenuMainmenu record) {
        BEGIN();
        UPDATE("hm_menu_mainmenu");
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            SET("remarks = #{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getvOutId() != null) {
            SET("v_out_id = #{vOutId,jdbcType=INTEGER}");
        }
        
        if (record.getSorting() != null) {
            SET("sorting = #{sorting,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getMenuIcon() != null) {
            SET("menu_icon = #{menuIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDelete() != null) {
            SET("is_delete = #{isDelete,jdbcType=VARCHAR}");
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