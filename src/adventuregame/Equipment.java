package adventuregame;

public class Equipment {
    private String name;
    private int dmg;
    private int hp;
    private boolean active;
    private boolean hasSpell;
    private String spellName;
    private boolean isAvailable;
    private double spellCd;
    private int spellDmg;
    private String type;

    public Equipment(String name, String type, int dmg, int hp, String spellName, double spellCd, int spellDmg, boolean hasSpell) 
    {
        this.name = name;
        this.type = type;
        this.dmg = dmg;
        this.hp = hp;
        this.spellName = spellName;
        this.spellCd = spellCd;
        this.spellDmg = spellDmg;
        this.hasSpell = hasSpell;
    }
    
    public boolean isHasSpell() {
        return hasSpell;
    }

    public void setHasSpell(boolean hasSpell) {
        this.hasSpell = hasSpell;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
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