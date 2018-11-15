package com.li.dao;/**
 * @author lihaodong
 * @create 2018-11-15 14:22
 * @desc
 **/

import com.li.model.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 * @author lihaodong

 * @create 2018-11-15 14:22

 * @desc
 * @mail lihaodong@bantus.cn

 **/
@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<UserVo> selectUser();

    @Insert("insert into user(age,name) values(#{age},#{name})")
    boolean insertUser(UserVo userVo);
}
