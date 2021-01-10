package com.ncu.entity;

public abstract class AbstractPosition {
    private String department;
    private String position;
    public abstract int addEmploye(User user);
    public abstract int delEmploye(User user);
    public abstract int approve_to_addEmploye(User user);
    public abstract int approve_to_delEmploye(User user);
    public abstract int apply_to_addEmploye(User user);
    public abstract int apply_to_delEmploye(User user);

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
