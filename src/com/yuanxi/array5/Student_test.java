package com.yuanxi.array5;

import java.util.Scanner;

public class Student_test {
    public static void main(String[] args) {
        //定义一个长度为3的数组，用来存储1~3个学生对象作为初始数据，学生的学号，姓名各不相同
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        //要求2：玩家完毕之后，遍历所有学生信息
        //要求3：通过id删除学生信息，如果存在，则删除，如果不存在，则提示删除失败
        //要求4：删除完毕之后，再次遍历所有学生信息
        //要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1，如果不存在，则提示没有此学生

        //创建数组
        Student[] arr = new Student[3];
        Student s1 = new Student(001,"小王",18);
        Student s2 = new Student(002,"小张",19);

        arr[0] = s1;
        arr[1] = s2;

        //再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student s3 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        int id = sc.nextInt();
        while(true){
            if((id == s1.getId()) || (id == s2.getId())){
                System.out.println("学号已存在！请重新输入");
                id = sc.nextInt();
                continue;
            }else{
                break;
            }
        }
        s3.setId(id);
        System.out.println("请输入姓名：");
        String name = sc.next();
        s3.setName(name);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        s3.setAge(age);
        arr[2] = s3;

        //遍历所有学生信息
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }

        //通过id删除学生信息，如果存在，则删除，如果不存在，则提示删除失败
        System.out.println("请输入要删除的学号：");
        int id1 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if(id1 == s.getId()){
                arr[i] = null;
                System.out.println("删除成功！");
                break;
            }else if(i == arr.length - 1){
                System.out.println("删除失败！");
            }
        }

        //删除完毕之后，再次遍历所有学生信息
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if(s != null){
                System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
            }
        }

        //查询数组id为“heima002”的学生，如果存在，则将他的年龄+1，如果不存在，则提示没有此学生
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s.getId() == 002){
                s.setAge(s.getAge() + 1);
                System.out.println("查询成功！");
                break;
            }
        }
    }
}
