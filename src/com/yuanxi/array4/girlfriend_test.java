package com.yuanxi.array4;

public class girlfriend_test {
    public static void main(String[] args){
        //数组存储4个男朋友的对象
        //计算出四个男朋友的平均年龄
        //统计年龄比平均值第的女朋友有几个，并把她们的所以信息打印出来

        grilfriend[] a = new grilfriend[4];
        a[0] = new grilfriend("小花",18,"女","画画");
        a[1] = new grilfriend("小李",19,"女","化妆");
        a[2] = new grilfriend("小王",20,"女","旅游");
        a[3] = new grilfriend("小张",21,"女","看剧");

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i].getAge();
        }
        int avg = sum / a.length;
        int count = 0;
        System.out.println("平均年龄：" + avg);
        for (int i = 0; i < a.length; i++) {
            if(a[i].getAge() > avg){
                count++;
                System.out.println(a[i].getName() + " " + a[i].getAge() + " " + a[i].getSex() + " " + a[i].getHobby());
            }
        }
        System.out.println("年龄比平均值高的女朋友有" + count + "个");
    }
}
