package adventuregame;

import java.util.ArrayList;
import java.util.HashMap;

public class Game 
{
    boolean gameRunning;
    Player player = new Player();
    HashMap<String, Floor> floors = new HashMap<String, Floor>();
    Output output = new Output();
    
    public void Start()
    {
        
        gameRunning = true;
        floors.put("0.0", new Floor(5, 0, 0, false, true, true, true, false, ""));
        
        floors.put("-1.1", new Floor(5, -1, 1, false, true, true, true, false, ""));
        floors.put("0.1", new Floor(0, 0, 1, false, true, false, true, false, ""));
        floors.put("1.1", new Floor(15, 1, 1, false, true, true, false, false, ""));
        
        floors.put("-1.2", new Floor(50, -1, 2, false, true, true, true, true, ""));
        floors.put("0.2", new Floor(13, 0, 2, false, true, false, true, false, ""));
        floors.put("1.2", new Floor(7, 1, 2, false, true, true, false, false, ""));
        
        floors.put("-1.3", new Floor(69, -1, 3, false, false, true, true, false, ""));
        floors.put("0.3", new Floor(25, 0, 3, false, false, false, true, false, ""));
        floors.put("1.3", new Floor(12, 1, 3, false, false, true, false, true, ""));
        
        
        
        while(gameRunning)
        {
            Floor floor = floors.get(player.getPosition());
            output.floorDescription(floor);
            for(int i = 0; i < 4; i++)
            {
            }
        }
    }
}
