package adventuregame;

public class Player 
{
    private int hp;
    private int maxHp;
    private int dmg;
    private int gold = 0;
    private int maxGold = 0;
    private String name;
    private int xPosition;
    private int yPosition;
    private String position = "0.0";
    private Inventory inventory = new Inventory();
    private Weapon weapon;
    private Spell spell;
    
    Player(int hp, int maxHp, int dmg)
    {
        this.hp = hp;
        this.maxHp = maxHp;
        this.dmg = dmg;
    }
    
    public void setWeapon(Weapon weapon){this.weapon = weapon;}
    public void setName(String name){this.name = name;}
    public void setHp(int hp){this.hp = hp;}
    public void setGold(int gold){this.gold = gold;}
    public void setPosition(){position = xPosition +"."+yPosition;}
    public void setSpell(Spell spell){this.spell = spell;}
    
    public int getHp(){return hp;}
    public int getDmg(){return dmg;}
    public int getGold(){return gold;}
    public Weapon getWeapon(){return weapon;}
    public String getName(){return name;}
    public Inventory getInventory(){return inventory;}
    public String getPosition(){return position;}
    public Spell getSpell(){return spell;}
    
    public void addToMaxGold(int maxGold){this.maxGold = maxGold;}
    
    public void equpipWeapon(Weapon weapon)
    {
        if(weapon != null)
        {
            if(this.weapon != null)
            {
                dmg -= this.weapon.getDmg();
            }
            this.weapon = weapon;
            dmg += weapon.getDmg();
        }
        else
        {
            if(this.weapon != null)
                dmg -= this.weapon.getDmg();
            this.weapon = null;
        }
    }
    
    public void m_North(Floor floor, Boundary boundary)
    {
        if(floor.isNorthExist())
        {
            yPosition++;
            setPosition();
        }
        else 
        {
            System.out.println((char) 27 + "[31mError invalid move.");
            boundary.playerInput(floor);
        }
    }
    public void m_East(Floor floor, Boundary boundary)
    {
        if(floor.isEastExist())
        {
            xPosition++;
            setPosition();
        }
        else 
        {
            System.out.println((char) 27 + "[31mError invalid move.");
            boundary.playerInput(floor);
        }
    }
    public void m_South(Floor floor, Boundary boundary)
    {
        if(floor.isSouthExist())
        {
            yPosition--;
            setPosition();
        }
        else 
        {
            System.out.println((char) 27 + "[31mError invalid move.");
            boundary.playerInput(floor);
        }
    }
    public void m_West(Floor floor, Boundary boundary)
    {
        if(floor.isWestExist())
        {
            xPosition--;
            setPosition();
        }
        else 
        {
            System.out.println((char) 27 + "[31mError invalid move.");
            boundary.playerInput(floor);
        }
    }
}