package com.ncu.UserUtil;

import com.ncu.CommodityUtil.commodity;

import java.util.List;

public class SaleEmploye extends AbstractPosition {
    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }

    public SaleEmploye() {
        super();
        super.setDepartment("销售部门");
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
    @Override
    public int add_commodity(commodity cmd) {
        System.out.println("没有权限");
        //System.out.println("添加商品：" + cmd.toString());
        return 0;
    }

    @Override
    public int del_commodity(commodity cmd) {
        System.out.println("没有权限");
        //System.out.println("删除商品：" + cmd.toString());
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
