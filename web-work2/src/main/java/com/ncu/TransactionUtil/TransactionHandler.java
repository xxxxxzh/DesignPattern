package com.ncu.TransactionUtil;


/**
 * 职责链模式，抽象事务请求处理者
 */
public abstract class TransactionHandler {

    protected TransactionHandler successor;
    public void setSuccessor(TransactionHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(transaction_entity request);
}
