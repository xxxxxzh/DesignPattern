package com.ncu.UserUtil.SubordinateStructure;

import java.util.ArrayList;

/**
 * 信息部门
 */
public class InformationDepartment extends worker {
    private ArrayList list = new ArrayList();
    public void add(worker element) {
        list.add(element);
    }

    public void remove(worker element) {
        list.remove(element);
    }
    public void introduce() {
        System.out.println("信息部门");
    }
}
