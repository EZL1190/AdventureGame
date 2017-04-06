package adventuregame;

public class Item implements ItemsInferface
{
    boolean won;
    String name;
    
    Item(boolean won, String name)
    {
        this.won = won;
        this.name = name;
    }

    @Override
    public void pickUp(PlayerV2 player) 
    {
        player.getInventory().addItem(this);
    }

    @Override
    public String getName() 
    {
        return"";
    }
    
    public void useItem(String name, GameV2 game)
    {
        switch(name)
        {
            case "won":
                game.gameRunning = false;
                break;
        }
    }

}