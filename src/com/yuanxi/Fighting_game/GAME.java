package com.yuanxi.Fighting_game;

public class GAME {
    public static void main(String[] args){
        role r1 = new role("乔峰",100);
        role r2 = new role("鸠摩智",100);
        while(true){
            r1.fight(r2);
            if(r2.getHealth() <= 0){
                System.out.println(r1.getGamename() + "胜利");
                break;
            }

            r2.fight(r1);
            if(r1.getHealth() <= 0){
                System.out.println(r2.getGamename() + "胜利");
                break;
            }
        }
    }
}
