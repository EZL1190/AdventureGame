package adventuregame;
public class Player 
{
    private int gold;
    private int hp;
    private int dmg;
    private String position = "0.0";
    private int xPosition;
    private int yPosition;
    private String name;
    private Inventory inventory = new Inventory();
    private Weapon weapon;
    private int maxHp;
    
    Player(String name, int hp, int maxHp, int dmg, Weapon weapon)
    {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.dmg = dmg + weapon.getDmg();
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getDmg()
    {
        return dmg;
    }
    
    public int getMaxHp()
    {
        return maxHp;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void getPositionSplit(String position)
    {
        String[] positions = position.split(".");
        int xPosition = Integer.parseInt(positions[0]);
        int yPosition = Integer.parseInt(positions[1]);
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public String getPosition()
    {
        return position;
    }
    //We take two ints and make them into a string and compare it to the room names
    public void setPosition()
    {
        position = xPosition +"."+yPosition;
    }
    
    public void m_North(Floor floor)
    {
        if(floor.isNorthExist())
        {
            yPosition++;
            setPosition();
        }
        else 
        {
            System.out.println("Error invalid move.");
        }
    }
    public void m_East(Floor floor)
    {
        if(floor.isEastExist())
        {
            xPosition++;
            setPosition();
        }
        else 
        {
            System.out.println("Error invalid move.");
        }
    }
    public void m_South(Floor floor)
    {
        if(floor.isSouthExist())
        {
            yPosition--;
            setPosition();
        }
        else 
        {
            System.out.println("Error invalid move.");
        }
    }
    public void m_West(Floor floor)
    {
        if(floor.isWestExist())
        {
            xPosition--;
            setPosition();
        }
        else 
        {
            System.out.println("Error invalid move.");
        }
    }
    
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
    
    public Inventory getInventory()
    {
        return inventory;
    }
    
    public Weapon getWeapon()
    {
        return weapon;
    }
    
}
