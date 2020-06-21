package com.ssm.dao;

import com.ssm.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {



    public List<User> list();
}
