package com.yuanxi.array4;

public class grilfriend {
    //创建一个女朋友对象，属性有：名字，年龄，性别，爱好
    private String name;
    private int age;
    private String sex;
    private String hobby;

    public grilfriend() {
    }

    public grilfriend(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
