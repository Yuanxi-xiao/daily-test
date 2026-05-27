package com.yuanxi.Fighting_game;

import java.util.Random;

public class role {
    //格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候）
    private String Gamename;
    private int health;

    public role() {
    }

    public role(String Gamename, int health) {
        this.Gamename = Gamename;
        this.health = health;
    }

    /**
     * 获取
     * @return gamename
     */
    public String getGamename() {
        return Gamename;
    }

    /**
     * 设置
     * @param Gamename
     */
    public void setGamename(String Gamename) {
        this.Gamename = Gamename;
    }

    /**
     * 获取
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    public String toString() {
        return "role{gamename = " + Gamename + ", health = " + health + "}";
    }

    //战斗方法
    public void fight(role role){
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        int rolehealth = role.getHealth() - damage;
        rolehealth = rolehealth < 0 ? 0 : rolehealth;
        role.setHealth(rolehealth);
        System.out.println(this.Gamename + "攻击了" + role.Gamename + "并造成了" + damage + "伤害"
        + role.getGamename() + "剩余" + rolehealth + "血量");
    }
}
