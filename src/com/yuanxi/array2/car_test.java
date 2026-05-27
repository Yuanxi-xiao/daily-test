package com.yuanxi.array2;

import java.util.Scanner;

public class car_test {
    public static void main(String[] args){
        //创建三个对象，数据通过键盘录入而来，并把对象存入数组中
        car[] arr = new car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            car c = new car();
            System.out.println("请输入第" + (i+1) + "台车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入第" + (i+1) + "台车的颜色：");
            String color = sc.next();
            c.setColor(color);
            System.out.println("请输入第" + (i+1) + "台车的价格：");
            double price = sc.nextDouble();
            c.setPrice(price);
            arr[i] = c;
        }

        for(int i = 0; i < arr.length; i++){
            car c = arr[i];
            System.out.println(c.getBrand() + "," + c.getColor() + "," + c.getPrice());
        }
    }
}
