package com.yuanxi.test1;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall_System {
    public static void main(String[] args) {
        //投注号码由6个红色球号码和1个蓝色球号码组成，红色球号码为1-33，蓝色球号码为1-16
        //随机生成6个1-33的随机数，并打印出来
        //一等奖：中6个红色球和1个蓝色球 最高1000万
        //二等奖：中6个红色球和0个蓝色球 最高500万
        //三等奖：中5个红色球和1个蓝色球 3000元
        //四等奖：中5个红色球和0个蓝色球 中4个红色球和1个蓝色球 200元
        //五等奖：中4个红色球和0个蓝色球 中3个红色球和1个蓝色球 10元
        //六等奖：中2个红色球和1个蓝色球 中1个红色球和1个蓝色球 中0个红色球和1个蓝色球 5元

        //随机生成中奖号码
        int[] pricecode = new int[7];
        Random r = new Random();
        boolean isRepeat = true;
        for(int i = 0; i < pricecode.length; i++){
            if(i < 6){
                int rednumber = r.nextInt(32) + 1;
                isRepeat = isRepeat(pricecode, rednumber);
                if(!isRepeat){
                    pricecode[i] = rednumber;
                }else{
                    i--;
                }
            }
            if(i == 6){
                int bluenumber = r.nextInt(16) + 1;
                pricecode[i] = bluenumber;
            }
        }

        System.out.println("中奖号码为：");
        for (int i = 0; i < pricecode.length; i++){
            System.out.print(pricecode[i] + " ");
        }

        //用户输入自己的号码
        int[] usercode = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int rednumber = sc.nextInt();
            if (rednumber >= 1 && rednumber <= 33){
                isRepeat = isRepeat(usercode, rednumber);
                if(!isRepeat){
                    usercode[i] = rednumber;
                }else{
                    i--;
                }
            }else{
                System.out.println("输入的号码有误，请重新输入！");
                i--;
            }
        }
        boolean flag = true;
        while(flag){
            System.out.println("请输入蓝色球号码：");
            int bluenumber = sc.nextInt();
            if (bluenumber >= 1 && bluenumber <= 16){
                usercode[6] = bluenumber;
                flag = false;
            }else {
                System.out.println("输入的号码有误，请重新输入！");
            }
        }

        //判断是否中奖
        int red = 0;
        int blue = 0;
        for(int i = 0; i < usercode.length - 1; i++){
            int rednumber = usercode[i];
            isRepeat = isRepeat(pricecode, rednumber);
            if (isRepeat){
                red++;
            }
        }
        if(usercode[6] == pricecode[6]){
            blue++;
        }
        System.out.println("恭喜你，中奖了" + red + "个红色球和" + blue + "个蓝色球");

        //判断中奖情况，并输出中奖情况
        if (red == 6 && blue == 1){
            System.out.println("恭喜，中奖了1000万元");
        } else if (red == 6 && blue == 0){
            System.out.println("恭喜，中奖了500万元");
        } else if (red == 5 && blue == 1) {
            System.out.println("恭喜，中奖了3000元");
        } else if ((red == 5 && blue == 0) || (red == 4 && blue == 1)) {
            System.out.println( "恭喜，中奖了200元");
        } else if ((red == 4 && blue == 0) || (red == 3 && blue == 1)) {
            System.out.println("恭喜，中奖了10元");
        } else if ((red == 2 && blue == 1) || (red == 1 && blue ==1) || (red == 0 && blue == 1)) {
            System.out.println("恭喜，中奖了5元");
        }else {
            System.out.println("未中奖");
        }

        //输出中奖号码
        System.out.println("中奖号码为：");
        for (int i = 0; i < pricecode.length; i++){
            System.out.print(pricecode[i] + " ");
        }
    }

    //判断随机生成的数字是否重复
    public static boolean isRepeat(int[] pricecode, int index){
        for(int i = 0; i < pricecode.length; i++){
            if(pricecode[i] == index){
                return true;
            }
        }
        return false;
    }
}
