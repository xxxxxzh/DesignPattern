package com.ncu.CommodityUtil;


import com.ncu.UserUtil.User;

/**
 * 具体策略模式：使用 Excel 进行报表
 */
public class ExcelReport extends ReportStrategy {
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
        System.out.println("以Excel方式报表");
    }
}
