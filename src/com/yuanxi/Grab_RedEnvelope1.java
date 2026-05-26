package com.yuanxi;

import java.util.Random;

public class Grab_RedEnvelope1 {
    public static void main(String[] args) {
        // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复
        //打印效果如下：（888元的奖金被抽出 588元的奖金被抽出
        // 10000元的奖金被抽出 1000元的奖金被抽出 2元的奖金被抽出）

        //定义一个数组记录奖项
        int[] a = {2,588,888,1000,10000};
        Random r = new Random();

        //随机交换数组元素
        for(int i = 0; i < a.length; i++){
            int index = r.nextInt(a.length);
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }

        //输出奖项
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + "元的奖金被抽出");
        }
    }
}
