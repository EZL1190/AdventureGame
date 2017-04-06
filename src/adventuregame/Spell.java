package adventuregame;

public class Spell {
    private Boolean hasSpell;
    private String name;
    private int dmg;
    private int cd;
    private int cdCount;
    
    Spell(String name, int dmg, int cd)
    {
        this.name = name;
        this.dmg = dmg;
        this.cd = cd;
        this.cdCount = cdCount;
    }

    public Boolean getHasSpell(){return hasSpell;}
    public String getName(){return name;}
    public int getDmg(){return dmg;}
    public int getCd(){return cd;}
    public int getCdCount(){return cdCount;}
    
    public void setCdCount(int cdCount){this.cdCount = cdCount;}
    
}