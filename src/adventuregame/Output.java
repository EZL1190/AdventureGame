package adventuregame;

import java.util.Scanner;

public class Output 
{
    Scanner userInput = new Scanner(System.in);
    public void Help() 
    {
        System.out.println("You've asked for help, these are all the commands in the game:");
        System.out.println("Type 'gold' to see how much gold you have.");
        System.out.println("Type 'quit' to leave the game.");
        System.out.println("You can go 4 directions, to go West type 'west', to go South type 'south' and so on. (West - Left, East - Right, North - Up, South - Down)");
        System.out.println("As you might have figured out, sometimes you're not able to go a certain direction, try another and see where that might take you.");
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
    
    public void playerInput()
    {
        System.out.println("\nEnter command: ");
        String input = userInput.nextLine();
        commands(input);
    }
    
    public void commands(String input)
    {
        input = input.toLowerCase();
        switch(input)
        {
            case"quit":
                break;
                
            case"help":
                break;
                
            case"gold":
                break;
                
            case"norht":
                break;
                
            case"west":
                break;
                
            case"south":
                break;
                
            case"east":
                break;
                
            default:
                break;
        }
    }
    
    public void quit() {
        
    }
    public void west() {
        
    }
    public void east() {
        
    }
    public void south() {
        
    }
    public void north() {
        
    }
    public void gold() {
        
    }
}



