package adventuregame;

import java.util.ArrayList;

public class Game {
    boolean gameRunning;
    ArrayList<Floor> floors = new ArrayList<Floor>();
    
    public void Start()
    {
        gameRunning = true;
        floors.add(new Floor(5, 0, 0, false, true, true, true, false, ""));
        floors.add(new Floor(0, 1, 0, false, true, false, true, false, ""));
        floors.add(new Floor(15, 2, 0, false, true, true, false, false, ""));
        
        floors.add(new Floor(50, 0, 1, false, true, true, true, true, ""));
        floors.add(new Floor(13, 1, 1, false, true, false, true, false, ""));
        floors.add(new Floor(7, 2, 1, false, true, true, false, false, ""));
        
        floors.add(new Floor(69, 0, 2, false, false, true, true, false, ""));
        floors.add(new Floor(25, 1, 2, false, false, false, true, false, ""));
        floors.add(new Floor(12, 2, 2, false, false, true, false, true, ""));
        while(gameRunning)
        {
            
        }
    }
}