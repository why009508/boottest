package com.jk.iservice;

import com.jk.dao.UserMapper;
import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IUserService implements UserService{
    private UserMapper userMapper;
    @Override
    public List<User> queryUser() {
        List<User> list = userMapper.queryUser();
        return list;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
