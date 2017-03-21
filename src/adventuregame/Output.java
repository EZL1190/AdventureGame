package adventuregame;

import java.util.Scanner;

public class Output 
{
    Scanner userInput = new Scanner(System.in);
    Game game;
    Player player;

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
     
    public void floorDescription(Floor floor)
    {
        System.out.println(floor.getDescription());
    }
    
    public void waysToGo(Floor floor)
    {
        System.out.println("\nYou can go: ");
        if(floor.isNorthExist())
            System.out.println("-North");
        if(floor.isWestExist())
            System.out.println("-West");
        if(floor.isSouthExist())
            System.out.println("-South");
        if(floor.isEastExist())
            System.out.println("-East");
    }
    
    public void playerInput(Floor floor)
    {
        System.out.println("\nEnter command: ");
        String input = userInput.nextLine();
        commands(input, floor);
    }
    
    public void commands(String input, Floor floor)
    {
        input = input.toLowerCase();
        switch(input)
        {
            case"quit":
                quit();
                break;
                
            case"help":
                Help();
                break;
                
            case"gold":
                gold();
                break;
                
            case"north":
                north(floor);
                break;
                
            case"west":
                west(floor);
                break;
                
            case"south":
                south(floor);
                break;
                
            case"east":
                east(floor);
                break;
                
            default:
                break;
        }
    }
    
    public void Help() 
    {
        System.out.println("You've asked for help, these are all the commands in the game:");
        System.out.println("Type 'gold' to see how much gold you have.");
        System.out.println("Type 'quit' to leave the game.");
        System.out.println("You can go 4 directions, to go West type 'west', to go South type 'south' and so on. (West - Left, East - Right, North - Up, South - Down)");
        System.out.println("As you might have figured out, sometimes you're not able to go a certain direction, try another and see where that might take you.");
    }
    
    public void quit() 
    {
        
    }
    public void west(Floor floor) 
    {
        player.m_West(floor);
    }
    public void east(Floor floor) 
    {
        
    }
    public void south(Floor floor) 
    {
        
    }
    public void north(Floor floor) 
    {
        
    }
    public void gold() 
    {
        
    }
}



