package com.springtest.chapter2.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloTest {

    @Test
    public  void testHelloWorld(){

        //1.读取配置文件实例化一个IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");

        //2.从容器中获取Bean，
        HelloApi helloApi = context.getBean("hello", HelloApi.class);
        //3.执行业务逻辑
        helloApi.sayHello();

    }

}
