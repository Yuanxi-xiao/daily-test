package com.yuanxi;

public class prime_number {
    public static void main(String[] args){
        boolean flag = true;
        int count = 0;
        for(int i = 101; i <= 200; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i + " ");
                count++;
            }
            flag = true;
        }
        System.out.println("共有" + count + "个素数");
    }
}
