package adventuregame;

import java.util.Scanner;

public class Boundary 
{
    private PlayerV2 player;
    private GameV2 game;
    private Scanner userInput = new Scanner(System.in);
    
    public void setPlayer(PlayerV2 player){this.player = player;}
    public void setGame(GameV2 game){this.game = game;}
    public void floorDescription(FloorV2 floor){System.out.println(floor.getDescription());}
    public void firstHit(){System.out.println("\nYou where hit by a surprise attack, and took 10 dmg");}
    public void combatStart(Enemy enemy, PlayerV2 player) 
    {
        System.out.println("\nYou've engaged an enemy!");
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m type: "+enemy.getName());
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m health: "+enemy.getHp());
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m attack damage: "+enemy.getDamage());
        System.out.println("");
        System.out.println("What would you like to do?");
    }
    
    public void combat(CombatV2 combat, PlayerV2 player, Enemy enemy, Inventory inventory) 
    {
        combatChoice(player);
        String input = userInput.nextLine();
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
                break;
        }
    }
    
    public void combatChoice(PlayerV2 player)
    {
        System.out.println("");   
        System.out.println((char) 27 + "[32m1; Attack! - " + player.getDmg() + " dmg");
        if(player.getSpell() == null){System.out.println((char) 27 + "[31m2; Use spell");}
        else if(player.getSpell() != null && player.getSpell().getCdCount() <= 0){System.out.println((char) 27 + "[32m2; Use spell " + player.getSpell().getName() + " - " + player.getSpell().getDmg() + " dmg");}
        else{System.out.println((char) 27 + "[31m2; Use spell " + player.getSpell().getName() + " - " + player.getSpell().getDmg() + " dmg - Cooldown " + player.getSpell().getCdCount() + " turns");}
        System.out.println((char) 27 + "[31m3; Use item - comming soon");
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
    
    public void drop(Enemy enemy, PlayerV2 player)
    {
        if(enemy.getLoot().getWeapon()!= null)
        {
            pickup(enemy.getLoot().getWeapon());
        }
        if(enemy.getLoot().getItem()!= null){}
        if(enemy.getLoot().getPotion() != null){}
        if(enemy.getLoot().getGold() != 0)
        {
            player.setGold(player.getGold() + enemy.getLoot().getGold());
            player.addToMaxGold(enemy.getLoot().getGold());
            System.out.println("Enemey droped " + enemy.getLoot().getGold() + " gold");
        }
    }
    
    public void loot(FloorV2 floor, PlayerV2 player) {
        System.out.println("\nYou have looted " + floor.getGold() + " gold from this room");
        int gold = floor.getGold() + player.getGold();
        player.addToMaxGold(floor.getGold());
        floor.lootFloor(player);
        System.out.println("You have " + gold + " gold in total\n");
    }
    
    public void waysToGo(FloorV2 floor) {
        System.out.println("\nYou can go: ");
        if (floor.isNorthExist()) {
            System.out.println((char) 27 + "[32m-North");
        }
        if (floor.isWestExist()) {
            System.out.println((char) 27 + "[32m-West");
        }
        if (floor.isEastExist()) {
            System.out.println((char) 27 + "[32m-East");
        }
        if (floor.isSouthExist()) {
            System.out.println((char) 27 + "[32m-South");
        }
    }

    public void playerInput(FloorV2 floor) {
        System.out.println("\nEnter command: ");
        String input = userInput.nextLine();
        commands(input, floor);
    }
    
    public void commands(String input, FloorV2 floor) {
        input = input.toLowerCase();
        switch (input) {
            case "changeweapon": case "cw":
                changeWeapon();
                playerInput(floor);
                break;
            case "showinventory": case "sinv":
                System.out.println(player.getInventory().showInventory());
                playerInput(floor);
                break;
                
            case "pickup": case "p":
                pickup(floor);
                playerInput(floor);
                break;
                
            case "quit":
                quit();
                break;

            case "help":
                Help();
                playerInput(floor);
                break;

            case "gold":
                gold();
                playerInput(floor);
                break;

            case "north": case "n":
                north(floor);
                break;

            case "west": case "w":
                west(floor);
                break;

            case "south": case "s":
                south(floor);
                break;

            case "east": case "e":
                east(floor);
                break;

            default:
                System.out.println((char) 27 + "[31mInvalid command");
                playerInput(floor);
                break;
        }
    }
    
    public void Help() {
        System.out.println("You've asked for help, these are all the commands in the game:");
        System.out.println("'gold' - show amount of gold");
        System.out.println("'quit' - quit the game");
        System.out.println("'north'/'west'/'east'/'south' - to a direction North - Up, West - Left, East - Right, South - Down)");
        System.out.println("'pickup'/'p' - to search for all items and pick them up");
        System.out.println("'showinventory'/'sinv' - to show full inventory");
        System.out.println("'changeweapon'/'cw' - to change between equipped weapon and one in the inventory");
    }
    
    public void changeWeapon()
    {
        if(player.getWeapon() != null)
            System.out.println("Current weapon: '" + player.getWeapon().getName() + "' dmg - " + player.getWeapon().getDmg());
        else
            System.out.println("You have no weapon equipped");
        System.out.println(player.getInventory().showWeapons());
        boolean validate = false;
        while(!validate)
        {
            int n = Integer.parseInt(userInput.nextLine());
            if(n == 1 || n == 2 || n == 3)
            {
                validate = true;
                player.getInventory().changeWeapon(player, (n-1));
            }
        }
    }
    
    void pickup(FloorV2 floor)
    {
        if(floor.hasWeapon())
        {
            if(player.getWeapon() == null)
            {
                player.equpipWeapon(floor.getWeapon());
                System.out.println("You have picked up and equiped " + floor.getWeapon().getName() + " - " + floor.getWeapon().getDmg() + " dmg");
            }
            else
            {
                System.out.println("\n");
                if(player.getInventory().maxWeapons())
                {
                    System.out.println("You have found " + floor.getWeapon().getName() + " - " + floor.getWeapon().getDmg() + " dmg");
                    System.out.println("You can't hold anymore weapons, drop a weapon y/n?");
                    String str = userInput.nextLine();
                    if(str.equals("y") || str.equals("yes"))
                    {
                        boolean validate = false;
                        while(!validate)
                        {
                            System.out.println("Which one will you drop?");
                            System.out.println(player.getInventory().showWeapons());
                            str = userInput.nextLine();
                            switch(str)
                            {
                                case "1":
                                    player.getInventory().dropWeapon(1);
                                    validate = true;
                                    break;
                                case "2":
                                    player.getInventory().dropWeapon(2);
                                    validate = true;
                                    break;
                                case "3":
                                    player.getInventory().dropWeapon(3);
                                    validate = true;
                                    break;
                                default:
                                    System.out.println("(char) 27 + \"[31mInvalid entry");
                                    break;
                            }
                        }
                    }
                }
                else
                {
                    System.out.println((char)27 + "[36mYou have picked up " + floor.getWeapon().getName());
                    floor.getWeapon().pickUp(player);
                    floor.setWeapon(null);
                }
            }
        }
        if(floor.getItem() != null){}
        if(floor.getPotion() != null){}
    }
    
    void pickup(WeaponV2 weapon)
    {
        if(player.getWeapon() == null)
        {
            player.equpipWeapon(weapon);
            System.out.println("You have picked up and equiped " + weapon.getName() + " - " + weapon.getDmg() + " dmg");
        }
        else
        {
            System.out.println("\n");
            if(player.getInventory().maxWeapons())
            {
                System.out.println("You have found " + weapon.getName() + " - " + weapon.getDmg() + " dmg");
                System.out.println("You can't hold anymore weapons, drop a weapon y/n?");
                String str = userInput.nextLine();
                if(str.equals("y") || str.equals("yes"))
                {
                    boolean validate = false;
                    while(!validate)
                    {
                        System.out.println("Which one will you drop?");
                        System.out.println(player.getInventory().showWeapons());
                        str = userInput.nextLine();
                        switch(str)
                        {
                            case "1":
                                player.getInventory().dropWeapon(1);
                                validate = true;
                                break;
                            case "2":
                                player.getInventory().dropWeapon(2);
                                validate = true;
                                break;
                            case "3":
                                player.getInventory().dropWeapon(3);
                                validate = true;
                                break;
                            default:
                                System.out.println("(char) 27 + \"[31mInvalid entry");
                                break;
                        }
                    }
                }
            }
            else
            {
                System.out.println((char)27 + "[36mYou have picked up " + weapon.getName());
                weapon.pickUp(player);
            }
        }
    }

    public void quit() {
        System.out.println("I guess you were too scared to make your way through this amazing maze, I guess it was all to much for a weak spirit like you.\n"
                + "I never really expected you to enter the door anyways, I was surprised to see a pleb like you enter this wonderful game.");
        game.setGameRunning(false);
    }

    public void west(FloorV2 floor){player.m_West(floor, this);}
    public void east(FloorV2 floor){player.m_East(floor, this);}
    public void south(FloorV2 floor){player.m_South(floor, this);}
    public void north(FloorV2 floor){ player.m_North(floor, this);}
    public void gold(){ System.out.println((char) 27 + "[33mGold:" + player.getGold());}
    
    public void wonGame()
    {
        System.out.println("Won game!!!! text something....!!");
    }
}