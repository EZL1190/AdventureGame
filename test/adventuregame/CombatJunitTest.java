/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author ezl
 */
public class CombatJunitTest {
    
    private BoundaryJunitTest boundary = new BoundaryJunitTest();
    
    public void fight(Player player, Enemy enemy, boolean spell)
    {
        if(player.getSpell().getCdCount() > 0)
            player.getSpell().setCdCount(player.getSpell().getCdCount()-1);
        if(!spell)
            playerAttack(player, enemy, false);
        else if(spell && player.getSpell().getCdCount() <= 0)
        {
            player.getSpell().setCdCount(player.getSpell().getCd());
            playerAttack(player, enemy, true);
        }
        
        if(enemy.getHp() > 0)   
            enemyAttack(player, enemy);
        
        if(player.getHp() <= 0)
            boundary.lostFight();
        else if(enemy.getHp() <= 0)
            boundary.wonFight();
        else 
            boundary.combat(this, player, enemy, player.getInventory());
    }
    
    public void playerAttack(Player player, Enemy enemy, boolean spell)
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
    
    public void enemyAttack(Player player, Enemy enemy)
    {
        player.setHp(player.getHp()-enemy.getDamage()); 
        boundary.fight(enemy.getDamage(), false, player.getHp());
    }
}
