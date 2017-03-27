package adventuregame;

public class Inventory {
    private Weapon[] weapons = new Weapon[3];
    private Item[] items = new Item[3];
    private Potion[] potions = new Potion[3];
    
    private int weaponCount = 0;
    private int itemCount = 0;
    private int potionCount = 0;

    public Weapon[] getWeapons() 
    {
        return weapons;
    }

    public void setWeapons(Weapon weapon) 
    {
        this.weapons[weaponCount] = weapon;
        weaponCount++;
    }

    public Item[] getItems() 
    {
        return items;
    }

    public void setItems(Item item) 
    {
        this.items[itemCount] = item;
        itemCount++;
    }

    public Potion[] getPotions() 
    {
        return potions;
    }

    public void setPotions(Potion potion) 
    {
        this.potions[potionCount] = potion;
        potionCount++;
    }
    
    
    
}