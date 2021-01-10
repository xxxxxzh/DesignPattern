package com.ncu.entity;

import org.apache.ibatis.jdbc.Null;

public class InfoManager extends AbstractPosition {
    public InfoManager() {
        super();
        super.setDepartment("信息部门");
        super.setPosition("经理");
    }
    public int addEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
    public int delEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
    public int approve_to_addEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
    public int approve_to_delEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
    public int apply_to_addEmploye(User user) {
        AbstractPosition position = user.getState();
        if (position != null && position.getDepartment().equals(super.getDepartment())
                && position.getPosition().equals("普通员工")) {
            System.out.println("申请添加用户：\n" + user.getUsername() + "\n部门: "
                    + position.getDepartment() + "\n职位：" + position.getPosition());
            return 1;
        } else {
            System.out.println("没有权限");
            return 0;
        }
    }
    public int apply_to_delEmploye(User user) {
        AbstractPosition position = user.getState();
        if (position != null && position.getDepartment().equals(super.getDepartment())
                && position.getPosition().equals("普通员工")) {
            System.out.println("申请删除用户：\n" + user.getUsername() + "\n部门: "
                    + position.getDepartment() + "\n职位：" + position.getPosition());
            return 1;
        } else {
            System.out.println("没有权限");
            return 0;
        }
    }
}
