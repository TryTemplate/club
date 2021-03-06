package com.club.web.dao;

import com.club.web.model.SysNewsType;
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

public interface SysNewsTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param id  Primary key for table sys_news_type
     * @return deleteByPrimaryKey
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Delete({
        "delete from sys_news_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param record  Model for table sys_news_type
     * @return   The last insert key for table sys_news_type
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Insert({
        "insert into sys_news_type (type_name, type_context, ",
        "is_delete, create_time, ",
        "update_time, admin_id, ",
        "admin_name)",
        "values (#{typeName,jdbcType=VARCHAR}, #{typeContext,jdbcType=VARCHAR}, ",
        "#{isDelete,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{adminId,jdbcType=INTEGER}, ",
        "#{adminName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysNewsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param record  Model for table sys_news_type
     * @return   The last insert key for table sys_news_type
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @InsertProvider(type=SysNewsTypeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(SysNewsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param id  Primary key for table sys_news_type
     * @return   Model for table sys_news_type
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Select({
        "select",
        "id, type_name, type_context, is_delete, create_time, update_time, admin_id, ",
        "admin_name",
        "from sys_news_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_context", property="typeContext", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR)
    })
    SysNewsType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param record  Model for table sys_news_type
     * @return   The last insert key for table sys_news_type
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @UpdateProvider(type=SysNewsTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysNewsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_news_type
     * @param record  Model for table sys_news_type
     * @return   The last insert key for table sys_news_type
     *
     * @mbggenerated Wed Sep 27 14:25:26 CST 2017
     */
    @Update({
        "update sys_news_type",
        "set type_name = #{typeName,jdbcType=VARCHAR},",
          "type_context = #{typeContext,jdbcType=VARCHAR},",
          "is_delete = #{isDelete,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "admin_id = #{adminId,jdbcType=INTEGER},",
          "admin_name = #{adminName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysNewsType record);
}