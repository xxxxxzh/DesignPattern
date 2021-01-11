package com.ncu.CommodityUtil;

import com.ncu.UserUtil.User;

import java.util.ArrayList;

/**
 * 观察者模式
 */
public abstract class CommodityElement {
    protected ArrayList commodities;
    public void setList(ArrayList list) {
        this.commodities = list;
    }

    public ArrayList getCommodities() {
        return commodities;
    }

    public void setList(String department) {
        System.out.println("获取部门：" + department + " 管理的商品集合");
        setList((ArrayList) null);
    }

    public void accept(CommodityVisitor visitor) {
        visitor.visit(this);
    }
}
