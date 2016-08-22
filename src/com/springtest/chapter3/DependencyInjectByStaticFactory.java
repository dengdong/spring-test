package com.springtest.chapter3;

import com.springtest.chapter2.helloworld.HelloApi;
import com.springtest.chapter2.helloworld.HelloImpl;

/**
 * Created by dengdd on 2016/8/22.
 */
public class DependencyInjectByStaticFactory {

    public  static HelloApi newInstance(String message, int index){
        return new HelloImpl3(message,index);
    }

}
