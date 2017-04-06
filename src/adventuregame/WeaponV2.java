package adventuregame;

public class WeaponV2 implements ItemsInferface{
    String name;
    int dmg;
    
    WeaponV2(String name, int dmg)
    {
        this.name = name;
        this.dmg = dmg;
    }
    public String getName(){return name;}
    public int getDmg(){return dmg;}
    
    public void pickUp(PlayerV2 player){player.getInventory().addWeapon(this);}
}