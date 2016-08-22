package com.springtest.chapter3;

/**
 * Created by dengdd on 2016/8/22.
 */
public class DependencyInjectByInstanceFactory {

    public  HelloImpl3 newInstance (String message, int index){
        return new HelloImpl3(message, index);
    }

}
