package com.yuanxi;

import java.util.Scanner;

public class arinplane_ticket {
    public static void main(String[] args){
        //输入机票原价，月份和头等舱或者经济舱
        //旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月-4月）头等舱7.5折，经济舱6.5折
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入头等舱还是经济舱（头等舱输入0，经济舱输入1）：");
        int type = sc.nextInt();
        if(month >= 5 && month <= 10){
            if(type == 0){
                price = price * 0.9;
            }else if(type == 1){
                price = price * 0.85;
            }
        } else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            if(type == 0){
                price = price * 0.75;
            }else if(type == 1){
                price = price * 0.65;
            }else{
                System.out.println("输入错误！");
            }
        }
        System.out.println("机票价格：" + price);
    }
}
