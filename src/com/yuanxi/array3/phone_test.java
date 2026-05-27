package com.yuanxi.array3;

public class phone_test {
    public static void main(String[] args){
        //定义数组存储3部手机对象，要求计算出三部手机的平均价格

        phone[] a = new phone[3];

        phone p1 = new phone("华为",5000,"蓝色");
        phone p2 = new phone("小米",3000,"黑色");
        phone p3 = new phone("苹果",8000,"白色");

        a[0] = p1;
        a[1] = p2;
        a[2] = p3;

        double average = 0;

        for (int i = 0; i < a.length; i++){
            phone p = a[i];
            average += p.getPrice();
        }
        average = average / a.length;
        System.out.println("平均价格：" + average);
    }
}
