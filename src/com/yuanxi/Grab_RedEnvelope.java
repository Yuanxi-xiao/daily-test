package com.yuanxi;

import java.util.Random;

public class Grab_RedEnvelope {
    public static void main(String[] args) {
        //一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复
        //打印效果如下：（888元的奖金被抽出 588元的奖金被抽出
        // 10000元的奖金被抽出 1000元的奖金被抽出 2元的奖金被抽出）

        //定义一个数组记录奖项
        int[] a = {2,588,888,1000,10000};
        Random r = new Random();

        //使用随机数，从数组中随机抽取一个数，如果该数不为0，则打印出来，并把该数变为0，
        //如果该数已经为0，则重新抽取，直到数组中所有数都为0
        for(int i = 0; i < a.length; i++){
            int index = r.nextInt(a.length);
            if(a[index] != 0){
                int temp = a[index];
                a[index] = 0;
                System.out.println(temp + "元的奖金被抽出");
            }else{
                i--;
            }
        }
    }
}
