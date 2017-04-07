package adventuregame;

public class Weapon implements ItemsInferface{
    private String name;
    private int dmg;
    
    Weapon(String name, int dmg)
    {
        this.name = name;
        this.dmg = dmg;
    }
    public String getName(){return name;}
    public int getDmg(){return dmg;}
    
    public void pickUp(Player player){player.getInventory().addWeapon(this);}
}