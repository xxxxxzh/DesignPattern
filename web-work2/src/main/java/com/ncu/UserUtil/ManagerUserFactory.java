package com.ncu.UserUtil;

/**
 * 具体工厂类：生成管理员用户
 *
 */
public class ManagerUserFactory extends UserFactory {

    @Override
    public User getUser() {
        System.out.println("获得一个管理员用户对象");
        return new ManagerUser();
    }
}
