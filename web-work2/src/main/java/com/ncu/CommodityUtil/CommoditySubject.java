package com.ncu.CommodityUtil;

import java.util.ArrayList;

/**
 * 商品观察者目标：
 */
public abstract class CommoditySubject {
    protected ArrayList observers = new ArrayList();
    protected ArrayList commodities;

    public void setCommodities(ArrayList commodities) {
        System.out.println("获取所有商品");
        this.commodities = commodities;
    }

    public void attach(CommodityObservers observer) {
        observers.add(observer);
    }
    public void detach(CommodityObservers observer) {
        observers.remove(observer);
    }
    public void update() {
        for (Object x : commodities) {
            if (((commodity) x).getCnt() < 500) {
                for (Object obs : observers) {
                    ((CommodityObservers) obs).sendRequest((commodity) x);
                }
            }
        }
    }
}
