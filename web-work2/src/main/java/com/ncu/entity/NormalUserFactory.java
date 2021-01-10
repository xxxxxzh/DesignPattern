package com.ncu.entity;

/**
 * 具体工厂类：普通用户工厂
 */
public class NormalUserFactory extends UserFactory {
    public NormalUserFactory() {

    }
    @Override
    public User getUser() {
        System.out.println("获得一个普通用户对象");
        return new NormalUser();
    }
}
