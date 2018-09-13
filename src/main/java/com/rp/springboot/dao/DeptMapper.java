package com.rp.springboot.dao;

import com.rp.springboot.beans.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2018/9/13
 */

//@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM DEPT WHERE NAME = #{name}")
    Dept findByName(@Param("name") String name);

    @Insert("INSERT INTO DEPT(ID, NAME) VALUES(#{id}, #{name})")
    int insert(@Param("id") int id, @Param("name") String name);

    @Select("SELECT * FROM DEPT")
    List<Dept> findAll();

}