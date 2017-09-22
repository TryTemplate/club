package com.club.web.dao;

import com.club.web.model.HmMenuSubmenu;

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

public interface HmMenuSubmenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param id  Primary key for table hm_menu_submenu
     * @return deleteByPrimaryKey
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @Delete({
        "delete from hm_menu_submenu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param record  Model for table hm_menu_submenu
     * @return   The last insert key for table hm_menu_submenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @Insert({
        "insert into hm_menu_submenu (title, url, ",
        "remarks, v_out_id, ",
        "sorting, status, ",
        "create_time, update_time, ",
        "is_delete, admin_id, ",
        "admin_name)",
        "values (#{title,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{remarks,jdbcType=VARCHAR}, #{vOutId,jdbcType=INTEGER}, ",
        "#{sorting,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{isDelete,jdbcType=VARCHAR}, #{adminId,jdbcType=INTEGER}, ",
        "#{adminName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(HmMenuSubmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param record  Model for table hm_menu_submenu
     * @return   The last insert key for table hm_menu_submenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @InsertProvider(type=HmMenuSubmenuSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(HmMenuSubmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param id  Primary key for table hm_menu_submenu
     * @return   Model for table hm_menu_submenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @Select({
        "select",
        "id, title, url, remarks, v_out_id, sorting, status, create_time, update_time, ",
        "is_delete, admin_id, admin_name",
        "from hm_menu_submenu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="v_out_id", property="vOutId", jdbcType=JdbcType.INTEGER),
        @Result(column="sorting", property="sorting", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR)
    })
    HmMenuSubmenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param record  Model for table hm_menu_submenu
     * @return   The last insert key for table hm_menu_submenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @UpdateProvider(type=HmMenuSubmenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HmMenuSubmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hm_menu_submenu
     * @param record  Model for table hm_menu_submenu
     * @return   The last insert key for table hm_menu_submenu
     *
     * @mbggenerated Mon Sep 18 10:55:56 CST 2017
     */
    @Update({
        "update hm_menu_submenu",
        "set title = #{title,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR},",
          "v_out_id = #{vOutId,jdbcType=INTEGER},",
          "sorting = #{sorting,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "is_delete = #{isDelete,jdbcType=VARCHAR},",
          "admin_id = #{adminId,jdbcType=INTEGER},",
          "admin_name = #{adminName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HmMenuSubmenu record);
    
    
    @Select({"select id,title,url,remarks,sorting from hm_menu_submenu where is_delete=1 and status=1 and v_out_id= #{mid,jdbcType=INTEGER} order by sorting"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="v_out_id", property="vOutId", jdbcType=JdbcType.INTEGER),
        @Result(column="sorting", property="sorting", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.INTEGER),
        @Result(column="admin_name", property="adminName", jdbcType=JdbcType.VARCHAR)
    })
	List<HmMenuSubmenu> getSmenuByMid(Integer mid);
}