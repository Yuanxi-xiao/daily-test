package com.yuanxi.array2;

public class car {
    //创建一个汽车对象，属性有：品牌，颜色，价格
    private String brand;
    private String color;
    private double price;

    public car() {
    }

    public car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "car{brand = " + brand + ", color = " + color + ", price = " + price + "}";
    }
}
