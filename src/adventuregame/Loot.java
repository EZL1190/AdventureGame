package adventuregame;

public class Loot 
{
    WeaponV2 weapon;
    Item item;
    Potion potion;
    int gold = 0;
    
    public Loot setLoot(WeaponV2 weapon){this.weapon = weapon; return this;}
    public Loot setLoot(Item item){this.item = item; return this;}
    public Loot setLoot(Potion potion){this.potion = potion; return this;}
    public Loot setLoot(int gold){this.gold = gold; return this;}
    
    public WeaponV2 getWeapon(){return weapon;}
    public Item getItem(){return item;}
    public Potion getPotion(){return potion;}
    public int getGold(){return gold;}
    
}