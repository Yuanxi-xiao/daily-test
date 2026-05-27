package com.yuanxi.array1;

public class Product {
    //定义数组存储3个商品对象
    // 商品的属性：商品的ID，名字，价格，库存
    private int id;
    private String name;
    private int price;
    private int stock;

    public Product() {
    }

    public Product(int id, String name, int price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Product{id = " + id + ", name = " + name + ", price = " + price + ", stock = " + stock + "}";
    }
}
