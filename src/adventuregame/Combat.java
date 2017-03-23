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
    Output output;
    
    public Combat(Output output)
    {
        this.output = output;
    }
    
    public void fight(Player player, Enemy enemy)
    {
        playerAttack(player, enemy);
        output.fight(player.getDmg(), true, enemy.getHp());
        
        enemyAttack(player, enemy);
        output.fight(enemy.getDamage(), false, player.getHp());
        
        if(player.getHp() <= 0)
            output.lostFight();
        else if(enemy.getHp() <= 0)
            output.wonFight();
        else
        {
            System.out.println("-------------");
            fight(player, enemy);
        }
        
    }
    
    
    public void playerAttack(Player player, Enemy enemy)
    {
        enemy.setHp(enemy.getHp()-player.getDmg());
        
    }
    
    public void enemyAttack(Player player, Enemy enemy)
    {
        player.setHp(player.getHp()-enemy.getDamage());
        
    }
    public void firstHit(Player player)
    {
        Random rand = new Random();
        int firsthit = rand.nextInt(100)+1;
        
        if(firsthit > 90)
        {
            player.setHp(player.getHp()-10);
            output.firstHit();
        }
    }
    
    
}
