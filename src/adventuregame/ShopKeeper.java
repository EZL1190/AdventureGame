package adventuregame;

import java.util.ArrayList;

public class ShopKeeper {
    ArrayList<Equipment> weapons = new ArrayList<Equipment>();
    
    public void buy(Player player, int i)
    {
        player.equpipWeapon(weapons.get(i));
    }
}