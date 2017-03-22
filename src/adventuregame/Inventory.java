package adventuregame;

import java.util.ArrayList;


public class Inventory {
    private ArrayList<Equipment> equipment = new ArrayList<Equipment>();
    private ArrayList<Item> item = new ArrayList<Item>();
    
    public void setEquipment(String name, Equipment equ)
    {
        equipment.add(equ);
    }
    
    public void setItem(String name, Item item)
    {
        this.item.add(item);
    }
    
    public Equipment getEquipment(int n)
    {
        return equipment.get(n);
    }
    
    public Item getItem(int n)
    {
        return item.get(n);
    }
    
    
}