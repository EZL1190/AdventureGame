package adventuregame;

public class Item implements ItemsInferface
{
    private String name;
    
    Item(String name)
    {
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
    
    public void useItem(String name, Game game)
    {
        switch(name)
        {
        }
    }

}