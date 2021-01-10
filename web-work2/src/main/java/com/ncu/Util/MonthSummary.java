package com.ncu.Util;

import com.ncu.entity.User;

/**
 * 按月汇总
 */
public class MonthSummary extends summary {
    @Override
    public void getSummary(User user) {
        System.out.println("用户：" + user.getUsername() +  "对" + user.getDepartment() + "所管理的商品按月汇总");
    }
}
