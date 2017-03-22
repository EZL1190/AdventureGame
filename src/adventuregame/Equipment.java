package adventuregame;

public class Equipment {
    private String name;
    private int dmg;
    private int hp;
    private boolean active;
    private String spellName;
    private double spellCd;
    private int spellDmg;

    public Equipment(String name, int dmg, int hp, boolean active, String spellName, double spellCd, int spellDmg) 
    {
        this.name = name;
        this.dmg = dmg;
        this.hp = hp;
        this.active = active;
        this.spellName = spellName;
        this.spellCd = spellCd;
        this.spellDmg = spellDmg;
    }
    
    public String getName()
    {
        return name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public double getSpellCd() {
        return spellCd;
    }

    public void setSpellCd(double spellCd) {
        this.spellCd = spellCd;
    }

    public int getSpellDmg() {
        return spellDmg;
    }

    public void setSpellDmg(int spellDmg) {
        this.spellDmg = spellDmg;
    }
    
    
    
}