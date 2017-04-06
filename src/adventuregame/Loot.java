package adventuregame;

public class Loot 
{
    WeaponV2 weapon;
    Item item;
    Potion potion;
    int gold = 0;
    
    public void setLoot(WeaponV2 weapon){this.weapon = weapon;}
    public void setLoot(Item item){this.item = item;}
    public void setLoot(Potion potion){this.potion = potion;}
    public void setLoot(int gold){this.gold = gold;}
    
    public WeaponV2 getWeapon(){return weapon;}
    public Item getItem(){return item;}
    public Potion getPotion(){return potion;}
    public int getGold(){return gold;}
    
}