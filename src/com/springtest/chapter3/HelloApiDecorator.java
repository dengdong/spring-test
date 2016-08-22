package com.springtest.chapter3;

import com.springtest.chapter2.helloworld.HelloApi;

/**
 * Created by dengdd on 2016/8/22.
 */
public class HelloApiDecorator implements  HelloApi {

    private HelloApi helloApi;

    public HelloApi getHelloApi() {
        return helloApi;
    }

    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    public  HelloApiDecorator()
    {

    }
    public  HelloApiDecorator(HelloApi helloApi){
        this.helloApi = helloApi;
    }

    @Override
    public void sayHello() {
        System.out.println("装饰器-------------");
        helloApi.sayHello();
        System.out.println("装饰器------------------");
    }
}
