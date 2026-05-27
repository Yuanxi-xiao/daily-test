package com.yuanxi.test1;

import java.util.Scanner;

public class Digital_Encryption {
    public static void main(String[] args) {
        //某系统的数字密码（大于0），比如1983，采用加密方式传输
        //先得到每位数，然后每位数搜加上5，在对10取余，最后讲所有数字反转，得到一串新数

        //输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        //定义一个数组,把整数里的每一个数放到数组里
        int number = 0;
        for(int i = num; i > 0;i /= 10){
            number++;
        }
        int a[] = new int[number];
        for(int i = a.length - 1; i >= 0; i--){
            a[i] = num % 10;
            num /= 10;
            System.out.println(a[i]);
        }


        //加密密码
        for(int i = 0; i < a.length; i++){
            a[i] = (a[i] + 5) % 10;
            System.out.print(a[i]);
        }
        System.out.println();
        //反转密码
        for(int i = 0, j = a.length - 1; i < j; i++, j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        //输出密码
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}
