package com.ncu.Util;

import com.ncu.entity.User;

/**
 * 使用策略模式来抽象报表策略
 * 其中的显示方式和查询方式使用桥接模式进行桥接
 */
public abstract class ReportStrategy {
    private summary summary;

    public com.ncu.Util.summary getSummary() {
        return summary;
    }

    public void setSummary(com.ncu.Util.summary summary) {
        this.summary = summary;
    }

    public abstract void report(User user,summary v);
}
