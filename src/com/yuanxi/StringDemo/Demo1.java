package com.yuanxi.StringDemo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        //已知正确的用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示。
        String username="admin";
        String password="596234";
        for(int i=1;i<=3;i++){
            System.out.println("请输入用户名：");
            String name=new Scanner(System.in).next();
            System.out.println("请输入密码：");
            String pwd=new Scanner(System.in).next();
            if(username.equals(name)&&password.equals(pwd)){
                System.out.println("登录成功！");
                break;
            } else if (i == 3) {
                System.out.println("登录失败！");
                break;
            }else {
                System.out.println("用户名或密码错误！您还剩下" + (3-i) + "次机会！");
            }
        }
    }
}
