package com.springtest.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dengdd on 2016/8/22.
 */
public class InstantiatingContainerTest {

    /*
    * 测试 使用构造器实例化Bean
     */
    @Test
    public  void testInstantiatingBeanByContructor(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
        HelloApi bean1 = factory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        HelloApi bean2 = factory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }


    @Test
    public  void testInstantiatingBeanByStaticFactory(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
        HelloApi bean = factory.getBean("bean3", HelloApi.class);
        bean.sayHello();
    }

    @Test
    public  void testInstantiatingBeanByInstanceFactory(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
        HelloApi bean = factory.getBean("bean4", HelloApi.class);
        bean.sayHello();
    }

}
