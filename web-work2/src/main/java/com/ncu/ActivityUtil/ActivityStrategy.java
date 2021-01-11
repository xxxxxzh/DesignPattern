package com.ncu.ActivityUtil;

import java.util.ArrayList;

/**
 * 策略模式
 */
public abstract class ActivityStrategy {
    public abstract void add(String department);
    public abstract void del(String department);
    public abstract void getParticipant();
}
