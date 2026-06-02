package com.yuanxi.StringDemo;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = "afjdJASDBF135";
        int Letter = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= '0' && c <= '9') {
                number++;
            } else if (c >= 'a' && c <= 'z') {
                other++;
            } else if (c >= 'A' && c <= 'Z') {
                Letter++;
            }
        }
        System.out.println("大写字母数量为:" + Letter + "小写字母数量为:" + other + "数字数量为:" + number);
    }
}
