package adventuregame;

public class FloorV2 
{

    private int gold;
    private int x;
    private int y;
    private boolean northExist;
    private boolean westExist;
    private boolean eastExist;
    private boolean southExist;
    private String description;
    private Enemy enemy = null;
    private WeaponV2 weapon = null;
    private Item item = null;
    private Potion potion = null;
    private Loot loot;
    
    FloorV2(int gold, int x, int y, boolean northExist, boolean westExist, boolean eastExist, boolean southExist, String description)
    {
        this.gold = gold;
        this.x = x;
        this.y = y;
        this.northExist = northExist;
        this.westExist = westExist;
        this.eastExist = eastExist;
        this.southExist = southExist;
        this.description = description;
    }
    
    public void setEnemy(Enemy enemy){this.enemy = enemy;}
    public void setLoot(Loot loot){this.loot = loot;}
    public void setWeapon(WeaponV2 weapon){this.weapon = weapon;}
    public void setItem(Item item){this.item = item;}
    public void setPotion(Potion potion){this.potion = potion;}
    
    public Enemy getEnemy(){return enemy;}
    public String getDescription(){return description;}
    public int getGold(){return gold;}
    public WeaponV2 getWeapon(){return weapon;}
    public Item getItem(){return item;}
    public Potion getPotion(){return potion;}
    
    public boolean isNorthExist() {return northExist;}
    public boolean isWestExist() {return westExist;}
    public boolean isEastExist() {return eastExist;}
    public boolean isSouthExist() {return southExist;}
    
    public boolean hasWeapon(){return weapon != null;}
    
    public void lootFloor(PlayerV2 player)
    {
        player.setGold(gold + player.getGold());
        gold = 0;
    }
    

}