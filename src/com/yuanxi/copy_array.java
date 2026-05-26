package com.yuanxi;

public class copy_array {
    public static void main(String[] args){
        //把一个数组中的元素复制到另一个新数组中去
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[a.length];
        for(int i = 0;i < a.length;i++){
            b[i] = a[i];
        }
        for(int i = 0;i < b.length;i++){
            System.out.print(b[i] + " ");
        }
        }
}
