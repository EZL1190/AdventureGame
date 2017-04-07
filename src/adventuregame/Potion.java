package adventuregame;

public class Potion implements ItemsInferface
{

    @Override
    public void pickUp(Player player) 
    {
        player.getInventory().addPotion(this);
    }

    @Override
    public String getName() 
    {
        return"";
    }

}