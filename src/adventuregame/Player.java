package adventuregame;
public class Player 
{
    private int gold;
    private int hp;
    private String position = "0.0";
    private int xPosition;
    private int yPosition;
    private String name;
    
    Player(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
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
    
}
