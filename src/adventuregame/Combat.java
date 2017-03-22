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
    
    
    public void playerAttack(Player player, Enemy enemy)
    {
        enemy.setHp(enemy.getHp()-player.getDmg());
        
    }
    
    public void enemyAttack(Player player, Enemy enemy)
    {
        player.setHp(player.getHp()-enemy.getDamage());
        
    }
    
    public boolean firstHit()
    {
        Random rand = new Random();
        int firsthit = rand.nextInt(100)+1;
        
        return firsthit > 90;
    }
    
    
}
