package com.yuanxi.test1;

import java.util.Random;

public class varification_code {
    public static void main(String[] args){
        //定义方法实现随机产生一个5位的验证码
        //验证码格式：长度为5，前四位是大写字母或者小写字母，最后一位是数字

        //先把A~Z，a~z，0~9放到一个数组中，然后随机抽取5个索引
        char[] chs = new char[62];
        for(int i = 0; i < chs.length; i++){
            if(i <= 25){
                chs[i] = (char)('A' + i);
            }else if(i >= 26 && i <= 51){
                chs[i] = (char)('a' + i - 26);
            }
            else{
                chs[i] = (char)('0' + i - 52);
            }
        }
        char[] code = getCode(chs);
        for(int i = 0; i < code.length; i++){
            System.out.print((char)code[i]);
        }

    }

    public static char[] getCode(char[] arr){
        char[] code = new char[5];
        for(int i = 0; i < code.length; i++){
            if(i <= 3){
                Random r = new Random();
                int index = r.nextInt(52);
                code[i] = arr[index];
            }else if(i == 4){
                Random r = new Random();
                int index = r.nextInt(9) + 52;
                code[i] = arr[index];
            }
        }
        return code;
    }
}
