package adventuregame;

public class Floor {
    private int gold;
    private String room;
    private boolean chest;
    private boolean northExist;
    private boolean westExist;
    private boolean eastExist;
    private boolean southExist;
    
    Floor(int gold, boolean chest, boolean northExist, boolean westExist, boolean eastExist, boolean southExist)
    {
        this.gold = gold;
        this.chest = chest;
        this.northExist = northExist;
        this.westExist = westExist;
        this.eastExist = eastExist;
        this.southExist = southExist;
    }
    
}