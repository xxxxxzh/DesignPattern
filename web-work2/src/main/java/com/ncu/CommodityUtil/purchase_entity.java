package com.ncu.CommodityUtil;

/**
 * 进货事件
 */
public class purchase_entity {
    private int id;
    private String commodity_type;
    private String username;
    private int status;
    private String startTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "purchase_entity{" +
                "id=" + id +
                ", commodity_type='" + commodity_type + '\'' +
                ", username='" + username + '\'' +
                ", status=" + status +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}
