package com.springtest.chapter3;

import com.springtest.chapter2.helloworld.HelloApi;
import com.springtest.chapter3.bean.ListTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dengdd on 2016/8/22.
 */
public class DependencyInjectTest {

    @Test
    public  void testConstructorDependencyInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/constructorDependencyInject.xml");

        HelloApi byIndex = factory.getBean("byIndex",  HelloApi.class);
        byIndex.sayHello();

        HelloApi byType = factory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = factory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }


    @Test
    public  void testStaticFactoryDependencyInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");

        HelloApi byIndex = factory.getBean("byIndex",  HelloApi.class);
        byIndex.sayHello();

        HelloApi byType = factory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = factory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public  void testInstanceFactoryDependencyInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");

        HelloApi byIndex = factory.getBean("byIndex",  HelloApi.class);
        byIndex.sayHello();

        HelloApi byType = factory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = factory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public  void testSetterDependencyInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/setterDependencyInject.xml");
        HelloApi api = factory.getBean("bean", HelloApi.class);
        api.sayHello();
    }

    @Test
    public  void testIdrefInject(){

        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/idrefInject.xml");
        IdRefTestBean api = factory.getBean("idrefBean1", IdRefTestBean.class);
        System.out.println(api);
        IdRefTestBean api1 = factory.getBean("idrefBean2", IdRefTestBean.class);
        System.out.println(api1);
    }

    @Test
    public  void testListInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/listInject.xml");
        ListTestBean bean = factory.getBean("listBean", ListTestBean.class);

        System.out.println(bean.getValues().size());
    }
}
