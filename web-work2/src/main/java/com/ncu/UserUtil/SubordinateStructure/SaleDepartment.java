package com.ncu.UserUtil.SubordinateStructure;

import java.util.ArrayList;

/**
 * 销售部门
 */
public class SaleDepartment extends worker {
    private ArrayList list = new ArrayList();
    public void add(worker element) {
        list.add(element);
    }

    public void remove(worker element) {
        list.remove(element);
    }
    @Override
    public void introduce() {
        System.out.println("销售部门");
    }
}
