package com.yuanxi.array1;

public class product_test {
    public static void main(String[] args){
        //创建三个商品对象，并把商品存入数组中
        Product[] arr = new Product[3];

        Product p1 = new Product(15698,"手机",1566,56);
        Product p2 = new Product(15458,"电脑",7856,49);
        Product p3 = new Product(13698,"手表",256,135);

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        for (int i = 0; i < arr.length; i++) {
            Product goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getStock());
        }

    }
}
