package cn.bdqn.service;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.dao.UserMapperImpl;
import cn.bdqn.factory.UserMapperFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements  UserService {
   // @Resource
    private UserMapper userMapper;
    @Override
    public void show() {
        userMapper.show();
    }

    public void setUserMapper1(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
