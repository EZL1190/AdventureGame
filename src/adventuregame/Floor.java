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
    private String description;
    
    Floor(int gold, int x, int y, boolean chest, boolean northExist, boolean westExist, boolean eastExist, boolean southExist, String description)
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
        player.setGold(gold);
        
    }
    
}