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
    public void pickUp(Player player) 
    {
        player.getInventory().addItem(this);
    }

    @Override
    public String getName() 
    {
        return"";
    }
    
    public void useItem(String name)
    {
        switch(name)
        {
            case "won":
                break;
        }
    }

}