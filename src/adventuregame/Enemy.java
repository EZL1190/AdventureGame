/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Random;

/**
 *
 * @author Shxnna
 */
public class Enemy {
    Random rand = new Random();
    
    private int hp;
    private int damage;
    private String name;
    private String[] type = {"Skeleton", "Zombie", "Goblin"};
    private int maxHp = 25;
    private int maxDamage = 15;
    
    
    public void Enemy(int hp, int damage, String name, String type) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
        //this.type = type;
    }
    
    public Enemy spawnEnemy()
    {
        this.hp = rand.nextInt(maxHp)+1;
        this.damage = rand.nextInt(maxDamage)+1;
        this.name = type[rand.nextInt(type.length)];
        return this;
    }

    public String getName()
    {
        return this.name;
        
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
