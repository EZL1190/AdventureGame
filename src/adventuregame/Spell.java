package adventuregame;

public class Spell {
    Boolean hasSpell;
    String name;
    int dmg;
    int cd;
    int cdCount;
    
    Spell(String name, int dmg, int cd, int cdcount)
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
    
}