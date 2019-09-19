package cn.bdqn.factory;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.dao.UserMapperImpl;

public class UserMapperFactory {
    private static UserMapper userMapper;
    public static UserMapper getUserMapper(){
        if(userMapper==null){
            userMapper=new UserMapperImpl();
        }
        return  userMapper;
    }
}
