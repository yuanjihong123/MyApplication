package com.hhxy.myapplication;

import java.io.Serializable;

/**
 * Created by 506-1 on 2017/3/15.
 */

public class City implements Serializable{
    private String name;
    private String sex;

    public City(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
