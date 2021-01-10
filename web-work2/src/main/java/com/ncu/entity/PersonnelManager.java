package com.ncu.entity;

import java.util.List;

public class PersonnelManager extends AbstractPosition {
    public PersonnelManager() {
        super();
        super.setDepartment("人事部门");
        super.setPosition("经理");
    }
    public int addEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("添加用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    public int delEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("删除用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    public int approve_to_addEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("同意添加用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    public int approve_to_delEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("同意删除用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    public int apply_to_addEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("申请添加用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    public int apply_to_delEmploye(User user) {
        AbstractPosition position = user.getState();
        System.out.println("申请删除用户：\n" + user.getUsername() + "\n部门: "
                + position.getDepartment() + "\n职位：" + position.getPosition());
        return 1;
    }
    @Override
    public int add_commodity(commodity cmd) {
        //System.out.println("没有权限");
        System.out.println("添加商品：" + cmd.toString());
        return 0;
    }

    @Override
    public int del_commodity(commodity cmd) {
        //System.out.println("没有权限");
        System.out.println("删除商品：" + cmd.toString());
        return 0;
    }

    @Override
    public int update_commodity(commodity a, commodity b) {
        System.out.println("修改商品：" + a.toString());
        System.out.println("新的商品：" + b.toString());
        return 0;
    }

    @Override
    public List<commodity> getAllCommodity() {
        System.out.println("查看部门 " + getPosition() + " 所管理的商品");
        return null;
    }
}
