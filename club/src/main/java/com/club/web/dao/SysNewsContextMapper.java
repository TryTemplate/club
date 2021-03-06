package com.club.web.dao;

import com.club.web.model.SysNewsContext;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysNewsContextMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param id  Primary key for table sys_news_context
     * @return deleteByPrimaryKey
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Delete({
        "delete from sys_news_context",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The last insert key for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Insert({
        "insert into sys_news_context (title, context, ",
        "label, type_id, is_delete, ",
        "create_time, update_time, ",
        "admin_id, admin_name)",
        "values (#{title,jdbcType=VARCHAR}, #{context,jdbcType=VARCHAR}, ",
        "#{label,jdbcType=VARCHAR}, #{typeId,jdbcType=INTEGER}, #{isDelete,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{adminId,jdbcType=INTEGER}, #{adminName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysNewsContext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The last insert key for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @InsertProvider(type=SysNewsContextSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SysNewsContext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param id  Primary key for table sys_news_context
     * @return   Model for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Select({
        "select",
        "id, title, context, label, type_id, is_delete, create_time, update_time, admin_id, ",
        "admin_name",
        "from sys_news_context",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="context", property="context", jdbcType=JdbcType.VARCHAR),
        @Result(column="label", property="label", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR)
    })
    SysNewsContext selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The last insert key for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @UpdateProvider(type=SysNewsContextSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysNewsContext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_context
     * @param record  Model for table sys_news_context
     * @return   The last insert key for table sys_news_context
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Update({
        "update sys_news_context",
        "set title = #{title,jdbcType=VARCHAR},",
          "context = #{context,jdbcType=VARCHAR},",
          "label = #{label,jdbcType=VARCHAR},",
          "type_id = #{typeId,jdbcType=INTEGER},",
          "is_delete = #{isDelete,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "admin_id = #{adminId,jdbcType=INTEGER},",
          "admin_name = #{adminName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysNewsContext record);
    
    @Select({"select c.id,c.title,t.type_name from sys_news_context c,sys_news_type t where c.type_id=t.id and c.is_delete=1 and c.is_delete=1"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="context", property="context", jdbcType=JdbcType.VARCHAR),
        @Result(column="label", property="label", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR)
    })
    List<SysNewsContext> getHotNews();
}