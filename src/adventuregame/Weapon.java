package adventuregame;

public class Weapon implements ItemsInferface
{

    @Override
    public void pickUp(Player player) 
    {
        player.getInventory().addWeapon(this);
    }

    @Override
    public String getName() 
    {
        return"";
    }

}