package com.yuanxi.test1;

public class Two_array {
    public static void main(String[] args) {
        //某商城每个季度的营业额如下：单位（万元）
        //第一季度：22,66,44
        //第二季度：77,33,88
        //第三季度：25,45,65
        //第四季度：11,66,99
        //要求计算出每个季度的总营业额和全年的总营业额
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int allsum = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            allsum += sum;
            System.out.println("第" + (i+1) + "季度的总营业额为：" + sum);
        }
        System.out.println("全年的总营业额为：" + allsum);
    }
}
