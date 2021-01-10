package com.ncu.entity;

public abstract class User implements Cloneable {
    /**
     * 原型模式 + 状态模式的抽象产品
     */
    private String username;
    private String password;
    private int sex;
    private String birthday;
    private String registration_date;
    private String grade;
    private String qq;
    private String wechat;
    private String phone;
    private String address;
    private AbstractPosition state;
    public User() {
        ;
    }
    public User(String username, String password, int sex, String birthday, String registration_date, String grade, String qq, String wechat, String phone, String address, AbstractPosition state) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.registration_date = registration_date;
        this.grade = grade;
        this.qq = qq;
        this.wechat = wechat;
        this.phone = phone;
        this.address = address;
        this.state = state;
    }

    public User(String username, String password, int sex, String birthday, String registration_date, String grade, String qq, String wechat, String phone, String address) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.registration_date = registration_date;
        this.grade = grade;
        this.qq = qq;
        this.wechat = wechat;
        this.phone = phone;
        this.address = address;
    }

    public User clone() {
        User object = null;
        try {
            object = (User) super.clone();
            System.out.println("复制了一个员工");
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not suppory cloneable");
        }
        return object;
    }
    public int addEmpolye(User user) {
        return state.addEmploye(user);
    }
    public int delEmpolye(User user) {
        return state.delEmploye(user);
    }
    public int approve_to_addEmploye(User user) {
        return state.approve_to_addEmploye(user);
    }
    public int approve_to_delEmploye(User user) {
        return state.approve_to_delEmploye(user);
    }
    public int apply_to_addEmploye(User user) {
        return state.apply_to_addEmploye(user);
    }
    public int apply_to_delEmploye(User user) {
        return state.apply_to_delEmploye(user);
    }

    public AbstractPosition getState() {
        return state;
    }

    public void setState(AbstractPosition state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return state.getDepartment();
    }
    public String getPosition() {
        return state.getPosition();
    }
}
