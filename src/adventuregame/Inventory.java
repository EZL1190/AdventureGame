package adventuregame;

import java.util.HashMap;

public class Inventory {
    HashMap<String, Equipment> equipment = new HashMap<String, Equipment>();
    HashMap<String, Item> item = new HashMap<String, Item>();
    
    public void setEquipment(String name, Equipment equ)
    {
        this.equipment.put(name, equ);
    }
    
    public void setItem(String name, Item item)
    {
        this.item.put(name, item);
    }
    
    public Equipment getEquipment(String name)
    {
        return this.equipment.get(name);
    }
    
    public Item getItem(String name)
    {
        return this.item.get(name);
    }
    
    
}