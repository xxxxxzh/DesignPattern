package com.ncu.CommodityUtil;

import com.ncu.UserUtil.User;

/**
 * 使用策略模式来抽象报表策略
 * 其中的显示方式和查询方式使用桥接模式进行桥接
 */
public abstract class ReportStrategy {
    private com.ncu.CommodityUtil.summary summary;

    public com.ncu.CommodityUtil.summary getSummary() {
        return summary;
    }

    public void setSummary(com.ncu.CommodityUtil.summary summary) {
        this.summary = summary;
    }

    public abstract void report(User user, com.ncu.CommodityUtil.summary v);
}
