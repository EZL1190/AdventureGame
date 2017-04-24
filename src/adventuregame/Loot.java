package adventuregame;

public class Loot 
{
    private Weapon weapon = null;
    private Item item = null;
    private Potion potion = null;
    private int gold = 0;
    
    public Loot setLoot(Weapon weapon){this.weapon = weapon; return this;}
    public Loot setLoot(Item item){this.item = item; return this;}
    public Loot setLoot(Potion potion){this.potion = potion; return this;}
    public Loot setLoot(int gold){this.gold = gold; return this;}
    
    public Weapon getWeapon(){return weapon;}
    public Item getItem(){return item;}
    public Potion getPotion(){return potion;}
    public int getGold(){return gold;}
    
}