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
    
    String[] enemies = { "Skeleton", "Zombie"};
    int maxEnemyHealth = 25;
    int enemyAttackDamage = 15; 
    
    
    
    
    public void spawnEnemy()
    {
        Random rand = new Random();
        String enemyType = enemies[rand.nextInt(enemies.length)];
        int enemyHealth = rand.nextInt(maxEnemyHealth)+1;
        int enemyAttack = rand.nextInt(enemyAttackDamage)+1;
    }
    
}
