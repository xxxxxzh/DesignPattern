package com.ncu.CommodityUtil;

import java.util.ArrayList;

/**
 * 访问模式：访问者
 */
public abstract class CommodityVisitor {
    public void visit(CommodityElement commodityElement) {
        ArrayList list = commodityElement.getCommodities();
        for (Object cmd : list) {
            if (((commodity) cmd).getCnt() < 500) {
                System.out.println("商品：" + ((commodity) cmd).toString() + " 需要进货");
            }
        }
    }
}
