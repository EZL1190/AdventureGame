package adventuregame;

public class Inventory {
    private Weapon[] weapons = new Weapon[3];
    private Item[] items = new Item[3];
    private Potion[] potions = new Potion[3];
    
    private int weaponCount = 0;
    private int itemCount = 0;
    private int potionCount = 0;

    public boolean maxWeapons()
    {
        return weaponCount >= weapons.length;
    }
    
    public boolean maxItems()
    {
        return itemCount >= items.length;
    }
    
    public boolean maxPotions()
    {
        return potionCount >= potions.length;
    }
    
    public Weapon[] getWeapons() 
    {
        return weapons;
    }

    public void addWeapon(Weapon weapon) 
    {
        this.weapons[weaponCount] = weapon;
        weaponCount++;
    }

    public Item[] getItems() 
    {
        return items;
    }

    public void addItem(Item item) 
    {
        this.items[itemCount] = item;
        itemCount++;
    }

    public Potion[] getPotions() 
    {
        return potions;
    }

    public void addPotion(Potion potion) 
    {
        this.potions[potionCount] = potion;
        potionCount++;
    }
    
    
    
}