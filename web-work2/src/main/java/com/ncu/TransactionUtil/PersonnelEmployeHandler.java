package com.ncu.TransactionUtil;

/**
 *人事部门员工：负责处理请假事务和办公室用品申请
 *
 */
public class PersonnelEmployeHandler extends TransactionHandler {
    @Override
    public void setSuccessor(TransactionHandler successor) {
        super.setSuccessor(successor);
    }

    @Override
    public void handleRequest(transaction_entity request) {
        String type = request.getTransaction_type();
        if (type.equals("办公室用品申请") || type.equals("请假")) {
            System.out.println("事务请求：" + request.toString() + " 已经发送给人事部门员工处理");
        } else {
            this.successor.handleRequest(request);
        }
    }
}
