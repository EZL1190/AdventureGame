package adventuregame;
public class Player 
{
    private int gold;
    private int hp = 100;
    private String position = "0.0";

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
    
    public void getPosition(String position)
    {
        String[] positions = position.split(".");
        int xPosition = Integer.parseInt(positions[0]);
        int yPosition = Integer.parseInt(positions[1]);
    }
    
    public void m_east(Floor floor, Player player)
    {
        
        
    }
    
}
