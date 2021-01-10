package com.ncu.entity;

public class PersonnelEmploye extends AbstractPosition {
    public PersonnelEmploye() {
        super();
        super.setDepartment("人事部门");
        super.setPosition("普通员工");
    }
    public int addEmploye(User user) {
        System.out.println("没有权限");
        return 0;
    }
    public int delEmploye(User user) {
        System.out.println("没有权限");
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
        System.out.println("没有权限");
        return 1;
    }
    public int apply_to_delEmploye(User user) {
        System.out.println("没有权限");
        return 1;
    }
}
