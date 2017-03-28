package adventuregame;

import java.util.Scanner;

public class Output {

    Scanner userInput = new Scanner(System.in);
    Game game;
    Player player;

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void floorDescription(Floor floor) {
        System.out.println(floor.getDescription());
    }

    public void loot(Floor floor) {
        System.out.println("\nYou have looted " + floor.getGold() + " gold from this room");
        int gold = floor.getGold() + player.getGold();
        System.out.println("You have " + gold + " gold in total\n");
    }

    public void waysToGo(Floor floor) {
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

    public void playerInput(Floor floor) {
        System.out.println("\nEnter command: ");
        String input = userInput.nextLine();
        commands(input, floor);
    }

    public void commands(String input, Floor floor) {
        input = input.toLowerCase();
        switch (input) {
            case "pickup": case "p":
                pickup(floor);
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
        System.out.println("Type 'gold' to see how much gold you have.");
        System.out.println("Type 'quit' to leave the game.");
        System.out.println("You can go 4 directions, to go West type 'west', to go South type 'south' and so on. (West - Left, East - Right, North - Up, South - Down)");
        System.out.println("As you might have figured out, sometimes you're not able to go a certain direction, try another and see where that might take you.");
    }
    
    void pickup(Floor floor)
    {
        if(floor.hasWeapon())
        {
         if(player.getInventory().maxWeapons())
         {
             System.out.println("You can't hold anymore weapons, drop a weapon y/n?");
             String str = userInput.nextLine();
             if(str.equals("y") || str.equals("yes"))
             {
                boolean validate = false;
                while(!validate)
                {
                    System.out.println("Which one will you drop?");
                    player.getInventory().showWeapon();
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
                            System.out.println("Invalid entry");
                            break;
                    }
                }
             }
         }
         else
         {
             floor.getWeapon().pickUp(player);
             floor.setWeapon(null);
         }
        }
        if(floor.hasItem())
        {
            if(player.getInventory().maxWeapons())
         {
             System.out.println("You can't hold anymore weapons, drop a weapon y/n?");
             String str = userInput.nextLine();
             if(str.equals("y") || str.equals("yes"))
             {
                boolean validate = false;
                while(!validate)
                {
                    System.out.println("Which one will you drop?");
                    player.getInventory().showInventory();
                    str = userInput.nextLine();
                    switch(str)
                    {
                        case "1":
                            player.getInventory().dropItem(1);
                            validate = true;
                            break;
                        case "2":
                            player.getInventory().dropItem(2);
                            validate = true;
                            break;
                        case "3":
                            player.getInventory().dropItem(3);
                            validate = true;
                            break;
                        default:
                            System.out.println("Invalid entry");
                            break;
                    }
                }
             }
         }
         else
         {
             floor.getItem().pickUp(player);
             floor.setItem(null);
         }
        }
        if(floor.hasPotion())
        {
        }
    }

    public void quit() {
        System.out.println("I guess you were too scared to make your way through this amazing maze, I guess it was all to much for a weak spirit like you.\n"
                + "I never really expected you to enter the door anyways, I was surprised to see a pleb like you enter this wonderful game.");;
        game.gameRunning = false;
    }

    public void west(Floor floor) {
        player.m_West(floor);
    }

    public void east(Floor floor) {
        player.m_East(floor);
    }

    public void south(Floor floor) {
        player.m_South(floor);
    }

    public void north(Floor floor) {
        player.m_North(floor);
    }

    public void gold() {
        System.out.println((char) 27 + "[33mGold:" + player.getGold());
    }

    public void error() {
        System.out.println((char) 27 + "[31mInvalid move.");
    }
//Explains the enemy
    public void combatStart(Enemy enemy) {
        System.out.println("\nYou've engaged an enemy!");
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m type: "+enemy.getName());
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m health: "+enemy.getHp());
        System.out.println((char) 27 + "[31mEnemy"+(char) 27 + "[30m attack damage: "+enemy.getDamage());
   
        System.out.println("");

        System.out.println("What would you like to do?");

    }

    public void combat(String input, Equipment equipment, Combat combat, Player player, Enemy enemy, Inventory inventory) {
        System.out.println("");
        System.out.println((char) 27 + "[32m1; Attack! - " + player.getDmg() + " dmg");

        if (equipment.isHasSpell()) {
            System.out.println((char) 27 + "[32m2; Use spell! - " + player.getWeapon().getSpellDmg() + " dmg");
        }

        if (!equipment.isHasSpell()) {
            System.out.println((char) 27 + "[31m2; Use spell");
        }

        System.out.println("3; Use item");

        input = userInput.nextLine();

        switch (input) {
            case "1":
                combat.fight(player, enemy);
                break;

            case "2":
                if (equipment.isHasSpell()) {
                    combat.fight(player, enemy);
                }

                if (!equipment.isHasSpell()) {
                    System.out.println((char) 27 + "[31mInvalid move");
                }
                combat(input, equipment, combat, player, enemy, inventory);
                break;

            case "3":
                itemMenu(inventory);
                break;

            default:
                System.out.println("(char) 27 + \"[31mInvalid selection");
                combat(input, equipment, combat, player, enemy, inventory);
                break;

        }
    }

    public void itemMenu(Inventory inventory) {
        
        //placeholder
        System.out.println("Inventory slot 1");
        System.out.println("Inventory slot 2");
        System.out.println("Inventory slot 3");

    }
    
    public void winText()
    {
        System.out.println("\nCongratulations once again, you've ended the game with: " + player.getGold() + " gold");
    }
    
    public void firstHit()
    {
        System.out.println("\nYou where hit by a surprise attack, and took 10 dmg");
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
                System.out.println("You died");
            else
                System.out.println("You have " + hp + " hp left");
        }
    }
    
    public void lostFight()
    {
        System.out.println("You lost the fight");
    }
    
    public void wonFight()
    {
        System.out.println("You won the fight");
    }
    
    public void gameOver()
    {
        System.out.println("\nYou lost gameover");
    }
    
    public void healing(int hp)
    {
        if(player.getHp() + hp >= player.getMaxHp())
        {
            System.out.println("You have ben fully healed");
            player.setHp(player.getMaxHp());
        }
        else
        {
            System.out.println("You have ben healed for " + hp + " hp");
            player.setHp(player.getHp() + hp);
        }
        
        System.out.println("You now have " + player.getHp() + " hp\n");
    }
    
}
