package adventuregame;

public class Item implements ItemsInferface
{

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

}