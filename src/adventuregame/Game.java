package adventuregame;

import java.util.ArrayList;
import java.util.HashMap;

public class Game 
{
    boolean gameRunning;
    HashMap<String, Floor> floors = new HashMap<String, Floor>();
    
    public void Start()
    {
        gameRunning = true;
        floors.put("0.0", new Floor(5, 0, 0, false, true, true, true, false, ""));
        floors.put("1.0", new Floor(0, 1, 0, false, true, false, true, false, ""));
        floors.put("2.0", new Floor(15, 2, 0, false, true, true, false, false, ""));
        
        floors.put("0.1", new Floor(50, 0, 1, false, true, true, true, true, ""));
        floors.put("1.1", new Floor(13, 1, 1, false, true, false, true, false, ""));
        floors.put("2.1", new Floor(7, 2, 1, false, true, true, false, false, ""));
        
        floors.put("0.2", new Floor(69, 0, 2, false, false, true, true, false, ""));
        floors.put("1.2", new Floor(25, 1, 2, false, false, false, true, false, ""));
        floors.put("2.2", new Floor(12, 2, 2, false, false, true, false, true, ""));
        
        
        
        while(gameRunning)
        {
            
        }
    }
}