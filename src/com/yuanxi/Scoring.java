package com.yuanxi;

import java.util.Random;
import java.util.Scanner;

public class Scoring {
    public static void main(String[] args) {
        //6名评委给选手打分，分数范围是[0-100]之间的整数。
        //选手的最后得分为：去掉最高分，最低分后的4个评委的平均分，完成上述过程并计算出选手的得分
        int[] score = new int[6];
        score = scoring(score);
//        //找出最高分和最低分，并计算平均分
//        int max = score[0];
//        int min = score[0];
//        double sum = 0;
//        for(int i = 1; i < score.length; i++){
//            if(score[i] > max){
//                max = score[i];
//            }
//            if(score[i] < min){
//                min = score[i];
//            }
//            sum += score[i - 1];
//        }
        int max = getmax(score);
        int min = getmin(score);
        double sum = getavg( score);
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("选手的得分为：" + sum);
        System.out.println("选手的得分为：" + (sum - max - min) / 4);
    }
    //定义一个数组记录6位评委的打分
    public static int[] scoring(int[] score){
        Scanner sc = new Scanner(System.in);
        //随机生成6个数
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int num = sc.nextInt();
            if(num >= 0 && num <= 100){
                score[i] = num;
            }else{
                System.out.println("输入的分数有误，请重新输入：");
                i--;
            }
        }
        return score;
    }

    //找出最高分
    public static int getmax(int[] score){
        int max = score[0];
        for(int i = 1; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            }
        }
        return max;
    }

    //找出最低分
    public static int getmin(int[] score){
        int min = score[0];
        for(int i = 1; i < score.length; i++){
            if(score[i] < min){
                min = score[i];
            }
        }
        return min;
    }

    //计算总分
    public static double getavg(int[] score){
        double sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return sum;
    }
}
