package com.club.web.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.club.web.model.SysUserAdmin;
import com.club.web.util.StringUtils;

public class SysUserAdminSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_admin
     * @param record  Model for table sys_user_admin
     * @return   The combine SQL for table sys_user_admin
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String insertSelective(SysUserAdmin record) {
        BEGIN();
        INSERT_INTO("sys_user_admin");
        
        if (record.getAccount() != null) {
            VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserRealName() != null) {
            VALUES("user_real_name", "#{userRealName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getCustomerType() != null) {
            VALUES("customer_type", "#{customerType,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarPath() != null) {
            VALUES("avatar_path", "#{avatarPath,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
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
        
        if (record.getPassword() != null) {
            VALUES("password", "AES_ENCRYPT( #{password,jdbcType=VARBINARY} ,'eici')");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_admin
     * @param record  Model for table sys_user_admin
     * @return   The combine SQL for table sys_user_admin
     *
     * @mbggenerated Tue Sep 12 14:44:38 CST 2017
     */
    public String updateByPrimaryKeySelective(SysUserAdmin record) {
        BEGIN();
        UPDATE("sys_user_admin");
        
        if (record.getAccount() != null) {
            SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserRealName() != null) {
            SET("user_real_name = #{userRealName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getCustomerType() != null) {
            SET("customer_type = #{customerType,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarPath() != null) {
            SET("avatar_path = #{avatarPath,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
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
        
        if (record.getPassword() != null) {
            SET("password = AES_ENCRYPT( #{password,jdbcType=VARBINARY} ,'eici')");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
    
    public String getUserAdminByAP(SysUserAdmin admin) {
		// TODO Auto-generated method stub
    	
    	StringBuffer sb = new StringBuffer("select * from sys_user_admin where 1=1");
    	
    	if (StringUtils.isNotBlank(admin.getAccount())) {
    		sb.append(" and account=#{account,jdbcType=VARCHAR}");
		}
    	
    	if (StringUtils.isNotBlank(admin.getPassword())) {
    		sb.append(" and AES_DECRYPT(password,'eici')=#{password,jdbcType=VARCHAR}");
    	}
    	
    	sb.append(" and is_delete = '1'");
    	
    	return sb.toString();
	}
    
    public String getAdminByAP(SysUserAdmin admin) {
    	// TODO Auto-generated method stub
    	
    	StringBuffer sb = new StringBuffer("select * from sys_user_admin where customer_type='2'");
    	
    	if (StringUtils.isNotBlank(admin.getAccount())) {
    		sb.append(" and account=#{account,jdbcType=VARCHAR}");
    	}
    	
    	if (StringUtils.isNotBlank(admin.getPassword())) {
    		sb.append(" and AES_DECRYPT(password,'eici')=#{password,jdbcType=VARCHAR}");
    	}
    	
    	sb.append(" and is_delete = '1'");
    	
    	return sb.toString();
    }
}