package cn.bdqn;

import cn.bdqn.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void show(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello= (Hello) context.getBean("hello");
        hello.show();
    }
}
