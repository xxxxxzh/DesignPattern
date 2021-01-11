package com.ncu.CommodityUtil;

public class SaleInformation_entity {
    private int id;
    private String commodity_number;
    private int amount;
    private double price;
    private double TotalProfit;
    private String year;
    private String month;
    private String day;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodity_number() {
        return commodity_number;
    }

    public void setCommodity_number(String commodity_number) {
        this.commodity_number = commodity_number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalProfit() {
        return TotalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        TotalProfit = totalProfit;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "SaleInformation_entity{" +
                "commodity_number='" + commodity_number + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", TotalProfit=" + TotalProfit +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
