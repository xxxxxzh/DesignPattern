package com.ncu.UserUtil.SubordinateStructure;

import java.util.ArrayList;

/**
 * 人事部门
 */
public class PersonnelDepartment extends worker{
    ArrayList list = new ArrayList();
    @Override
    public void introduce() {
        System.out.println("人事部门");
    }
    public void add(worker element) {
        list.add(element);
    }

    public void remove(worker element) {
        list.remove(element);
    }
}
