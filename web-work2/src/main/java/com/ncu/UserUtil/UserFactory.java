package com.ncu.UserUtil;

/**
 * 抽象工厂类：用户对象生成工厂
 */
public abstract class UserFactory {
    public UserFactory() {

    }
    public abstract User getUser();
}
