package cn.bdqn.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements  UserMapper {
    @Override
    public void show() {
        System.out.println("这个是测试！");
    }

    @Override
    public void find() {
        System.out.println("");
    }
}
