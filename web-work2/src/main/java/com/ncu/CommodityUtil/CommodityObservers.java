package com.ncu.CommodityUtil;

public abstract class CommodityObservers {
    public void sendRequest(commodity cmd) {
        System.out.println("商品: " + cmd.toString() + " 需要进货");
    }
}
