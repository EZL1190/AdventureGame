package adventuregame;

public class Potion implements ItemsInferface
{
    private String name = "";
    private int amount = 0;

    Potion(String name, int amount)
    {
        this.name = name;
        this.amount = amount;
    }
    
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