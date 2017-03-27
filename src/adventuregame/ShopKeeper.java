package adventuregame;

import java.util.ArrayList;

public class ShopKeeper {
    ArrayList<Equipment> weapons = new ArrayList<Equipment>();
    Item healtPot = new Item();
    int healtPots = 2;
    
    public void buy(Player player, int i)
    {
        player.equpipWeapon(weapons.get(i));
    }
}