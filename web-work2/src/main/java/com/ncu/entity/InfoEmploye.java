package com.ncu.entity;

public class InfoEmploye extends AbstractPosition {
    public InfoEmploye() {
        super();
        super.setDepartment("信息部门");
        super.setPosition("普通员工");
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
        System.out.println("没有权限");
        return 0;
    }
    public int apply_to_delEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
}
