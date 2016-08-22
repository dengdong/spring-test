package com.springtest.chapter2.helloworld;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloApiInstanceFactory {

    public  HelloApi newInstance (String message){
        return new HelloImpl(message);
    }

}
