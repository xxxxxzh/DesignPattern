package com.ncu.Util;

import com.ncu.entity.User;

/**
 * 具体策略模式：使用 Excel 进行报表
 */
public class ExcelReport extends ReportStrategy {
    @Override
    public com.ncu.Util.summary getSummary() {
        return super.getSummary();
    }

    @Override
    public void setSummary(com.ncu.Util.summary summary) {
        super.setSummary(summary);
    }

    @Override
    public void report(User user, com.ncu.Util.summary v) {
        setSummary(v);
        v.getSummary(user);
        System.out.println("以Excel方式报表");
    }
}
