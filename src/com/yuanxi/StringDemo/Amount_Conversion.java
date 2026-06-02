package com.yuanxi.StringDemo;

import java.util.Scanner;

public class Amount_Conversion {
    public static void main(String[] args) {
        // 金额转换
        int money;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if(money >= 0 && money <= 999999999){
                System.out.println(money);
                break;
            }else{
                System.out.println("输入金额有误，请重新输入！");
            }
        }

        //计算money的位数
        int count = 0;
        for (int i = money; i > 0; i--) {
            count++;
            i = i / 10;
            if(i == 1){
                count++;
            }
        }

        //数组保存
        int[] arr = new int[10];
        for (int i = 1; i <= count; i++) {
            arr[count - i] = money % 10;
            money = money / 10;
        }

        //转换
        System.out.print("转换结果为：");
        int num;
        int units = 0;
        for (int i = 0; i < count; i++) {
            num = arr[i];
            System.out.print(toUpperCase(arr,num));
            units = count - i - 1;
            System.out.print(unit(units));
        }
    }

    //将数字转换为大写数字
    public static String toUpperCase(int[] arr, int num){
        String[] units = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return units[num];
    }

    //加入 单位
    public static String unit(int units){
        String[] units2 = {"元","拾","佰","仟","万","拾","佰","仟","亿"};
        return units2[units];
    }
}
