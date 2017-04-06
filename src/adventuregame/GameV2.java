package adventuregame;

import java.util.HashMap;

public class GameV2 
{
    boolean gameRunning = true;
    HashMap<String, FloorV2> floors = new HashMap<String, FloorV2>();
    PlayerV2 player = new PlayerV2(100, 100, 2);
    Boundary boundary = new Boundary();
    CombatV2 combat = new CombatV2(boundary);
    
    public void start()
    {
        boundary.setPlayer(player);
        boundary.setGame(this);
        instantiateFloors();
        while(gameRunning)
        {
            FloorV2 floor = floors.get(player.getPosition());
            boundary.floorDescription(floor);
            // if(player.getPosition().equals("")){//sout("win game") gameRunning = false, continue;}
            if(floor.getEnemy() != null)
            {
                combat.firstHit(player, boundary);
                boundary.combatStart(floor.getEnemy(), player);
                boundary.combat(combat, player, floor.getEnemy(), player.getInventory());
                if(player.getHp() <= 0)
                {
                    boundary.gameOver();
                    gameRunning = false;
                    continue;
                }
                //boundary.drop(floor.getEnemy(), player);
                floor.setEnemy(null);
            }
            boundary.loot(floor, player);
            boundary.waysToGo(floor);
            boundary.playerInput(floor);
        }
    }
    
    public void instantiateFloors()
    {
        floors.put("0.0", new FloorV2(0, 0, 0, true, false, false, false,
                "Name: Start room\n"
                + "You’re standing in a bright hallway, and the door behind you just closed.\n"
                + "You’ve tried to open it, but it’s stuck. There’s only one thing to do, you must proceed forward.\n"
                + "Unless you’re a pussy, then there’s a vent up to the left, just type ‘quit’ and get out of this badass dungeon.\n"
                + "If you at any point need help, try the help command 'help'"
        ));
        floors.get("0.0").setWeapon(new WeaponV2("Rusty", 10));
        
        floors.put("0.1", new FloorV2(5, 0, 1, false, true, true, false,
                "Name: Lord von Apache’s treasure room\n"
                + "This is the room of Lord von Apache, what you see here is the remains of him, there wasn’t a lot but it’s a start.\n"
                + "The room is grey, with multiple pieces of art around the walls the furniture is covered in white sheets to protect their value. "
        ));
        floors.get("0.1").setEnemy(new Enemy().spawnEnemy());
        
        floors.put("1.1", new FloorV2(15, 1, 1, false, true, false, false,
                "Name: Watchmaker Hummels’ chamber\n"
                + "The door is heavy and you’re pushing it with all you’ve got, the door is old and making a lot of noise.\n"
                + "You’ve finally managed to force the door open, as you go in the door shuts loudly behind you.\n"
                + "There’s a sudden flash before your eyes, it’s the old watchmaker Sir. Hummels.\n"
                + "He’s pointing towards the lamp in the left corner of the room. You decide to check the lamp and find a bunch of coins. "
        ));
        
        floors.put("-1.1", new FloorV2(0, -1, 1, false, false, true, false,
                "Name: Ham room\n"
                + "The room you just entered is freezing cold and there’s a weird smell. The floor is wet and the walls are covered in blue tiles.\n"
                + "As you stare out in the freezing room you see pieces of ham lying around on the floor, that explains the smell and the wet floor.\n"
                + "As you could imagine there’s no valuables in here, you should consider getting out real fast.\n"
                + "There’s said to be a curse in this room that might change the way you look."
        ));
    }
}