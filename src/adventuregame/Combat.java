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
public class Combat {
    
    public void fight(Player player, Enemy enemy)
    {
        playerAttack(player, enemy);
        enemyAttack(player, enemy);
        
    }
    
    
    public void playerAttack(Player player, Enemy enemy)
    {
        enemy.setHp(enemy.getHp()-player.getDmg());
        
    }
    
    public void enemyAttack(Player player, Enemy enemy)
    {
        player.setHp(player.getHp()-enemy.getDamage());
        
    }
    //We've made a chance that the enemy can suprise and make the first move and make a suprise attack.
    public void firstHit(Player player)
    {
        Random rand = new Random();
        int firsthit = rand.nextInt(100)+1;
        
        if(firsthit > 90)
            player.setHp(player.getHp()-10);
    }
    
    
}
