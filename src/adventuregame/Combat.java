package adventuregame;

import java.util.Random;

public class Combat {
    Output output;
    
    public Combat(Output output)
    {
        this.output = output;
    }
    
    public void fight(Player player, Enemy enemy, boolean spell)
    {
        if(spell == false)
        { 
           playerAttack(player, enemy, false);
            output.fight(player.getDmg(), true, enemy.getHp());
        }
        else
        {
            playerAttack(player, enemy, true);
            output.fight(player.getWeapon().spellDmg, true, enemy.getHp());
        }
        
        if(enemy.getHp() > 0)   
        {
            enemyAttack(player, enemy);
            output.fight(enemy.getDamage(), false, player.getHp());
        }
        if(player.getHp() <= 0)
            output.lostFight();
        else if(enemy.getHp() <= 0)
            output.wonFight();
        else
        {
            output.combat("", player.getWeapon(), this, player, enemy, player.getInventory());
        }
        
    }
    
    
    public void playerAttack(Player player, Enemy enemy, boolean spell)
    {
        if(spell == false)
            enemy.setHp(enemy.getHp()-player.getDmg());
        else
            enemy.setHp(enemy.getHp()-player.getWeapon().spellDmg);
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
        
        if(firsthit > 80)
        {
            player.setHp(player.getHp()-10);
            output.firstHit();
        }
    }
    
    
}
