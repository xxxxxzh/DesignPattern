package com.ncu.entity;

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
}
