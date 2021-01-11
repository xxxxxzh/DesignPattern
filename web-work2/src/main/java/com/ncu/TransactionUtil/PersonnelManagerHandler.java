package com.ncu.TransactionUtil;


/**
 * 指定所有事务请求由人事部门来处理
 * 职责链模式的具体处理者：人事经理
 * 所有人事经理都能看到这些事务请求，并进行处理
 */
public class PersonnelManagerHandler extends  TransactionHandler{
    @Override
    public void setSuccessor(TransactionHandler successor) {
        super.setSuccessor(successor);
    }

    @Override
    public void handleRequest(transaction_entity request) {
        System.out.println("事务请求：" + request.toString() + " 已经发送给人事部门经理处理");
    }
}
