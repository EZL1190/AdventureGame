package adventuregame;

public class Weapon implements ItemsInferface
{
    String name;
    int dmg;
    boolean lifeSteal;
    int lifeStealAmount;
    String spellName;
    int spellDmg;
    int spellCd;
    int cdCount = 0;
    boolean spellActive;
    
    Weapon(String name, int dmg, boolean lifeSteal, int lifeStealAmount, String spellName, int spellDmg, int spellCd, boolean spellActive)
    {
        this.name = name;
        this.dmg = dmg;
        this.lifeSteal = lifeSteal;
        this.lifeStealAmount = lifeStealAmount;
        this.spellName = spellName;
        this.spellDmg = spellDmg;
        this.spellCd = spellCd;
        this.spellActive = spellActive;
    }

    public int getCdCount() {
        return cdCount;
    }

    public void setCdCount(int cdCount) {
        this.cdCount = cdCount;
    }

    public int getDmg() {
        return dmg;
    }

    public boolean isLifeSteal() {
        return lifeSteal;
    }

    public int getLifeStealAmount() {
        return lifeStealAmount;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellDmg() {
        return spellDmg;
    }

    public int getSpellCd() {
        return spellCd;
    }

    public void setSpellActive(boolean spellActive) {
        this.spellActive = spellActive;
    }
    
    public boolean getSpellActive()
    {
        return spellActive;
    }
    
    public boolean isHasSpell()
    {
        return !spellName.equals("");
    }
    
    @Override
    public void pickUp(Player player) 
    {
        player.getInventory().addWeapon(this);
    }

    @Override
    public String getName() 
    {
        return name;
    }

}