package com.springtest.chapter3;

import com.springtest.chapter2.helloworld.HelloApi;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloImpl3 implements HelloApi {

    private String message;
    private int index;

    @java.beans.ConstructorProperties({"message", "index"})
    public  HelloImpl3(String message , int index){
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(message + "--" + index);
    }
}
