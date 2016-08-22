package com.springtest.chapter3;

/**
 * Created by dengdd on 2016/8/22.
 */
public class IdRefTestBean {

    public  String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdRefTestBean{" +
                "id='" + id + '\'' +
                '}';
    }
}
