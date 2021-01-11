package com.ncu.CommodityUtil;


import com.ncu.UserUtil.User;

/**
 * 柱形图方式报表
 */
public class ColumnChartReport extends ReportStrategy {
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
        v.getSummary(user);
        System.out.println("以柱形图方式报表");
    }
}
