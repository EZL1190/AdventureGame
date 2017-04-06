package adventuregame;

import java.util.Random;

public class CombatV2 {
    
    Boundary boundary;
    
    public CombatV2(Boundary boundary){this.boundary = boundary;}
    
    public void firstHit(PlayerV2 player, Boundary boundary)
    {
        Random rand = new Random();
        int firsthit = rand.nextInt(100)+1;
        
        if(firsthit > 80)
        {
            player.setHp(player.getHp()-10);
            boundary.firstHit();
        }
    }
    
    public void fight(PlayerV2 player, Enemy enemy, boolean spell)
    {
        if(!spell)
            playerAttack(player, enemy, false);
        else
            playerAttack(player, enemy, true);
        
        if(enemy.getHp() > 0)   
            enemyAttack(player, enemy);
        
        if(player.getHp() <= 0)
            boundary.lostFight();
        else if(enemy.getHp() <= 0)
            boundary.wonFight();
        else 
            boundary.combat(this, player, enemy, player.getInventory());
    }
    
    
    public void playerAttack(PlayerV2 player, Enemy enemy, boolean spell)
    {
        if(!spell)
        {
            enemy.setHp(enemy.getHp()-player.getDmg());
            boundary.fight(player.getDmg(), true, enemy.getHp());
        }
        else 
        {
            enemy.setHp(enemy.getHp()-player.getSpell().getDmg());
            boundary.fight(player.getSpell().getDmg(), true, enemy.getHp());
        }
    }
    
    public void enemyAttack(PlayerV2 player, Enemy enemy)
    {
        player.setHp(player.getHp()-enemy.getDamage()); 
        boundary.fight(enemy.getDamage(), false, player.getHp());
    }
}