package com.ncu.CommodityUtil;

/**
 * 商品实体
 */
public class commodity {
    private String number;  //编号
    private String type;    //类型
    private String name;    //名称
    private double price;   //单价
    private String place;   //产源地
    private String introduce;
    private String image;
    private int cnt;        //库存数量

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "commodity{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", place='" + place + '\'' +
                ", introduce='" + introduce + '\'' +
                ", image='" + image + '\'' +
                ", cnt=" + cnt +
                '}';
    }
}
