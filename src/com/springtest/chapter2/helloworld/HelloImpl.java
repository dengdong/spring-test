package com.springtest.chapter2.helloworld;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloImpl implements  HelloApi {

    private  String message;

    public  HelloImpl(){
        this.message = "Hello Spring!";
    }
    public  HelloImpl(String message){
        this.message = message;
    }



    @Override
    public void sayHello() {
        System.out.println(this.message);
    }
}
