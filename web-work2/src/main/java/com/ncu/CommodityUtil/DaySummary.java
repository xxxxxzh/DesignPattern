package com.ncu.CommodityUtil;

import com.ncu.UserUtil.User;

/**
 * 按日汇总
 */
public class DaySummary extends summary {
    @Override
    public void getSummary(User user) {
        System.out.println("用户：" + user.getUsername() +  "对" + user.getDepartment() + "所管理的商品按日汇总");
    }
}
