package com.springtest.chapter3;

import com.springtest.chapter2.helloworld.HelloApi;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloImpl4 implements HelloApi {

    private  String message;
    private int index;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public void sayHello() {
        System.out.println( this.message + "---" + this.index );
    }
}
