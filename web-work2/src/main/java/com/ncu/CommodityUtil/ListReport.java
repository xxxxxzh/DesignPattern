package com.ncu.CommodityUtil;

import com.ncu.UserUtil.User;

/**
 * 策略模式：具体策略类，列表报表
 */
public class ListReport extends ReportStrategy {
    @Override
    public com.ncu.CommodityUtil.summary getSummary() {
        return super.getSummary();
    }

    @Override
    public void setSummary(com.ncu.CommodityUtil.summary summary) {
        super.setSummary(summary);
    }

    @Override
    public void report(User user, com.ncu.CommodityUtil.summary v) {
        setSummary(v);
        getSummary().getSummary(user);
        System.out.println("以列表方式报表");
    }
}
