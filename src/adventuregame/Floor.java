package adventuregame;

public class Floor {
    private int gold;
    /**
     * Horizontal placement
     */
    int x;
    /** 
     * Vertical placement
     */
    int y;
    private boolean chest;
    private boolean northExist;
    private boolean westExist;
    private boolean eastExist;
    private boolean southExist;
    private boolean hasEnemy;
    private String description;
    private boolean hasEquipment;
    private boolean hasItem;
    private Equipment equipment;
    private Enemy enemy;
    private Item item;
    
    Floor(int gold, int x, int y, boolean chest, boolean northExist, boolean westExist, boolean eastExist, boolean southExist, boolean hasEnemy, String description)
    {
        this.gold = gold;
        this.x = x;
        this.y = y;
        this.chest = chest;
        this.northExist = northExist;
        this.westExist = westExist;
        this.eastExist = eastExist;
        this.southExist = southExist;
        this.description = description;
        this.hasEnemy = hasEnemy;
    }

    public boolean isNorthExist() {return northExist;}

    public boolean isWestExist() {return westExist;}

    public boolean isEastExist() {return eastExist;}

    public boolean isSouthExist() {return southExist;}

    public String getDescription() {
        return description;
    }
    public void giveGold(Player player)
    {
        player.setGold(gold + player.getGold());
    }
    public boolean hasChest()
    {
        if(chest == true)
            return true;
        return false;
    }

    public int getGold() {
        return gold;
    }
    
    public boolean gethasEnemy()
    {
        return hasEnemy;
    }
    
    
    public void getItem(Player player)
    {
        if(hasEquipment)
        {
            player.addItem(equipment);
            hasEquipment = false;
        }
    }
    
    public void setEnemy(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    public Enemy getEnemy()
    {
        return enemy;
    }
       
}