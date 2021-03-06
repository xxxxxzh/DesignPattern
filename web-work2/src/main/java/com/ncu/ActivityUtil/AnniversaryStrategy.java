package com.ncu.ActivityUtil;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */
public class AnniversaryStrategy extends ActivityStrategy{
    ArrayList list = new ArrayList();
    @Override
    public void add(String department) {
        list.add(department);
    }

    @Override
    public void del(String department) {
        list.remove(department);
    }

    @Override
    public void getParticipant() {
        Iterator department = list.iterator();
        while (department.hasNext()) {
            System.out.println((String) department.next());
        }
    }
}
