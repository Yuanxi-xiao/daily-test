package com.yuanxi.StringDemo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        //键盘录入一个字符串，是用程序实现在控制台便利该字符串
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.println(c);
        }
    }
}
