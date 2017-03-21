package adventuregame;

public class Output 
{
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



