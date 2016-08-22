package com.springtest.chapter2.helloworld;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloApiStaticFactory {
    //工厂方法
    public  static  HelloImpl newInstance(String message){
        return new HelloImpl(message);
    }
}
