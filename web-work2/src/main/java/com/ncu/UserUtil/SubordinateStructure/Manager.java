package com.ncu.UserUtil.SubordinateStructure;

/**
 * 经理职位
 */
public class Manager extends worker{
    @Override
    public void introduce() {
        System.out.println("部门经理");
    }
}
