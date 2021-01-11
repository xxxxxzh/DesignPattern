package com.ncu.TransactionUtil;

/**
 *事务实体，记录各种事务，及其内容
 */
public class transaction_entity {
    private int id;
    private String transaction_type;
    private String content;
    private String applicant;
    private String application_time;
    private String start_time;
    private String end_time;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplication_time() {
        return application_time;
    }

    public void setApplication_time(String application_time) {
        this.application_time = application_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "transaction_entity{" +
                "id=" + id +
                ", transaction_type='" + transaction_type + '\'' +
                ", content='" + content + '\'' +
                ", applicant='" + applicant + '\'' +
                ", application_time='" + application_time + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", status=" + status +
                '}';
    }
}
