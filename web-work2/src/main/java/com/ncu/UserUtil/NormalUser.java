package com.ncu.UserUtil;

public class NormalUser extends User {
    @Override
    public User clone() {
        return super.clone();
    }

    public NormalUser() {
        super();
    }
    public NormalUser(String username, String password, int sex, String birthday, String registration_date, String grade, String qq, String wechat, String phone, String address) {
        super(username, password, sex, birthday, registration_date, grade, qq, wechat, phone, address);
    }

    public NormalUser(String username, String password, int sex, String birthday, String registration_date, String grade, String qq, String wechat, String phone, String address, AbstractPosition state) {
        super(username, password, sex, birthday, registration_date, grade, qq, wechat, phone, address, state);
    }
}
