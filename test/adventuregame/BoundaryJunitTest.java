package adventuregame;

import java.util.Scanner;

public class BoundaryJunitTest 
{
    private Player player;
    private Game game;
    private Scanner userInput = new Scanner(System.in);
    
    public void setPlayer(Player player){this.player = player;}
    public void setGame(Game game){this.game = game;}
    public void floorDescription(Floor floor){System.out.println(floor.getDescription());}
    public void firstHit(){System.out.println("\nYou where hit by a surprise attack, and took 10 dmg");}
   
     public void combat(CombatJunitTest combat, Player player, Enemy enemy, Inventory inventory) 
    {
        String input = "1";
        System.out.println("");
        switch(input)
        {
            default:
                System.out.println((char) 27 + "[31m2; Invalid move");
                combat(combat, player, enemy, inventory);
                break;
            case "1":
                combat.fight(player, enemy, false);
                break;
            case "2":
                if(player.getSpell() == null){System.out.println((char) 27 + "[31m2; Invalid move"); combat(combat, player, enemy, inventory);}
                else{combat.fight(player, enemy, true);}
                break;
            case "3":
                System.out.println((char) 27 + "[31m2; Invalid move");
                combat(combat, player, enemy, inventory);
                break;
        }
    }
     
     public void fight(int dmg, boolean enemy, int hp)
    {
        if(enemy)
        {
            System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m took " + dmg + " dmg");
            if(hp <= 0)
                System.out.println((char) 27 + "[32mEnemy died");
            else
                System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m has " + hp + " hp left");
        }
        else
        {
            System.out.println("You took " + dmg + " dmg");
            if(hp <= 0)
                System.out.println((char) 27 + "[31mYou died");
            else
                System.out.println("You have " + hp + " hp left");
        }
    }
     
    public void lostFight(){System.out.println((char) 27 + "[31mYou lost the fight");}
    public void wonFight(){System.out.println("You won the fight");}
    public void gameOver(){System.out.println("\nYou lost gameover");}
}