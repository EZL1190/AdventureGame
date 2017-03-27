package adventuregame;

import java.util.ArrayList;
import java.util.HashMap;

public class Game 
{
    boolean gameRunning;
    Player player = new Player("player", 50, 50, 2, new Equipment("Rusty", "weapon", 2, 0, "", 0, 0, false));
    HashMap<String, Floor> floors = new HashMap<String, Floor>();
    Output output = new Output();
    Combat combat = new Combat(output);
    
    public void Start()
    {
        output.setGame(this);
        output.setPlayer(player);
        //Here we make the floors from the predesigned map, giving them locations, gold enemies and a storyline. We also control which doorways are open and such.
        gameRunning = true;
        floors.put("0.0", new Floor(0, 0, 0, false, true, false, false, false, false,
                "Name: Start room\n"
                + "You’re standing in a bright hallway, and the door behind you just closed.\n"
                + "You’ve tried to open it, but it’s stuck. There’s only one thing to do, you must proceed forward.\n"
                + "Unless you’re a pussy, then there’s a vent up to the left, just type ‘quit’ and get out of this badass dungeon.\n"
                        + "If you at any point need help, try the help command 'help'"
        ));
        
        floors.put("-1.1", new Floor(0, -1, 1, false, false, true, true, false, true,
                "Name: Ham room\n"
                + "The room you just entered is freezing cold and there’s a weird smell. The floor is wet and the walls are covered in blue tiles.\n"
                + "As you stare out in the freezing room you see pieces of ham lying around on the floor, that explains the smell and the wet floor.\n"
                + "As you could imagine there’s no valuables in here, you should consider getting out real fast.\n"
                + "There’s said to be a curse in this room that might change the way you look."
        ));
        floors.get("-1.1").setEnemy(new Enemy().spawnEnemy());
        
        floors.put("0.1", new Floor(5, 0, 1, false, true, true, true, false, false,
                "Name: Lord von Apache’s treasure room\n"
                + "This is the room of Lord von Apache, what you see here is the remains of him, there wasn’t a lot but it’s a start.\n"
                + "The room is grey, with multiple pieces of art around the walls the furniture is covered in white sheets to protect their value. "
        ));
        floors.put("1.1", new Floor(15, 1, 1, false, true, true, false, false, false,
                "Name: Watchmaker Hummels’ chamber\n"
                + "The door is heavy and you’re pushing it with all you’ve got, the door is old and making a lot of noise.\n"
                + "You’ve finally managed to force the door open, as you go in the door shuts loudly behind you.\n"
                + "There’s a sudden flash before your eyes, it’s the old watchmaker Sir. Hummels.\n"
                + "He’s pointing towards the lamp in the left corner of the room. You decide to check the lamp and find a bunch of coins. "
        ));
        
        floors.put("-1.2", new Floor(13, -1, 2, false, false, true, false, false, false,
                "Name: The yard of knowledge\n"
                + "You’ve found your way outside, you’re now standing in the yard of knowledge, it says that this yard contains all the knowledge of senpai Ronnie.\n"
                + "Some of the artifacts in this yard contains great power, but with great power comes great responsibility…\n"
                + "At least that’s what they tell us, you could also just have fun and use the power in whatever way you find appropriate…\n"
                + "Whatever you want to do."
        ));
        floors.put("0.2", new Floor(50, 0, 2, false, true, false, true, true, false,
                "Name: The hiding closet of Lucas Kuhn\n" 
                + "Go back, hurry it’s a trap. Nah man just kidding, it’s safe in here… Trust me.\n"
                + "You’re scared now aren’t you?\n" 
                + "You’re in the hiding closet of the maniac, Lucas Kuhn – Which explains the hooks and tools on the wall.\n"
                + "He was into some weird stuff, a lot of his late nights were spend in this room.\n"
                + "Some people say he was acting as a maniac at day and a pimp at night, if you look closely you might find items of high value.\n"
                + "This closet has secret exits, try and find your way out before the maniac Kuhn gets back."
        ));
        floors.put("1.2", new Floor(7, 1, 2, false, true, true, false, true, true,
                "Name: Hall of ghosts\n" 
                + "You’ve entered a hall which is completely dark, you’re fumbling your way through the hall and stumbling across some sharp edges, what could this be?\n"
                + "You decide to back away from the edges, there’s a solid structure behind you.\n"
                + "Your heart is racing and you feel a cold breeze on your neck.\n"
                + "You turn around and try to feel what the structure is to guide you towards one of the exits.\n"
                + "There’s a temperature change in the room, you feel something passing right through you.\n"
                + "You hear the sound of an instrument starting to play, a piano to be exact.\n"
                + "This place doesn’t seem to have any valuables, except that small gold bar over there, quickly grab it!"
        ));
        floors.get("1.2").setEnemy(new Enemy().spawnEnemy());
        
        floors.put("-1.3", new Floor(25, -1, 3, false, false, true, true, true, true,
                "Name: The room of Migos\n"
                + "There’s a tune playing, the room is filled with smoke. The rhythm is bad, some might even say boujee.\n"
                + "You feel dizzy, the smoke is getting to you, this might not be regular smoke.\n"
                + "Let’s explore the room and find out what’s causing all this, you see a couple of guys sitting in a couch.\n"
                + "They’re smoking something and asks you if you want a hit.\n"
                + "You say no thanks but ask them if they have some spare change for hungry traveler.\n"
                + "Out of context they drop some sweet bars “Raindrops, drop tops”, you leave the room all confused and light headed."
        ));
        floors.get("-1.3").setEnemy(new Enemy().spawnEnemy());
        floors.put("0.3", new Floor(69, 0, 3, false, false, true, false, true, false,
                "Name: The blacksmiths forgery\n"
                + "This is the forgery of an old blacksmith, his origin remains unknown but he was a hard working fella.\n"
                + "The room has a nice temperature, heated, maybe there has been someone in here recently.\n"
                + "Checking the forge you find a sword, newly created. It’s the sword of TAG.\n"
                + "This sword has no real fighting power, but maybe the shopkeeper Ronnie is interested in it.\n"
                + "If you haven’t discovered him yet, he is hiding Southwest, from your location.\n"
                + "The real value of the sword is unknown, but maybe it’s worth a shot visiting the nice shopkeeper?\n" +
                "Hint: It is… Go there right now."
        ));
        floors.put("-2.4", new Floor(1337, -2, 4, true, false, false, false, false, false,
                "Name: The great hall of memes\n"
                + "Congratulations dear traveler, you’ve now made your way to the end of this amazing maze..\n"
                + "Sounds like amazing graze doesn’t it? Anyhow, you’ve been rewarded for your endurance and great spirit.\n"
                + "We would like to give you some kind of token of appreciation, but all we got is gold so here you go."
        ));
        floors.put("-2.1", new Floor(20, -2, 1, false, true, false, true, false, true,
                
                "Name: MingLee’s Asian Supermarket\n" 
                + "You’ve entered the infamous MingLee’s supermarket, this place was filled with delicious specialties from the Asian culture.\n"
                + "The supermarket went bankrupt as soon as MingLee was killed by a horde of enemies.\n"
                + "What remains of his shop is guarded by those enemies who ruined his beautiful shop.\n"
                + "The smell is strong, all the different spices combining to make an odor so strong that only Zombies would be able to survive in here." 
        ));
        floors.get("-2.1").setEnemy(new Enemy().spawnEnemy());
        floors.put("-2.2", new Floor(45, -2, 2, false, true, false, false, true, true,
                
                "Name: The programmer’s bungalow\n" 
                + "You’ve entered the room of the most hardworking coders in this universe, these two incredible programmers have been working all week to accomplish the almighty creators wicked ideas.\n"
                + "You’ve disturbed them in their making of the next evolution of TAG, for this you will be punished.\n"
                + "Because of their non-stop hard work, these students have become Zombies with an unfulfilled hunger for study points.\n"
                + "You must give them their well-earned study points, to make it out of this maze." 
        ));
        floors.get("-2.2").setEnemy(new Enemy().spawnEnemy());
        floors.put("-2.3", new Floor(100, -2, 3, false, false, false, true, true, false,
                
                "Name:  The Vosserfall \n" 
                + "Would you look at that! It’s the Vosserfall, the world’s largest waterfall, named after the legend himself, the almighty creator of this universe.\n"
                + "The water falls in such elegance you’ve never seen before, the water is crystal clear.\n"
                + "Heaven is as blue as the sea, no skies in sight and the sun has never shined brighter upon you.\n"
                + "The beautiful environment has cleansed your soul and regained all your lost stats." 
        ));
        floors.put("1.3", new Floor(12, 1, 3, false, true, false, false, true, false,
                
                "Name: Childhood home\n" 
                + "In some weird way, you’ve ended up in your childhood home, this place is filled with memories.\n"
                + "I’m sure you know your way around this place better than I do. \n"
                + "Have a look around and see if you can find any valuables to help you along the way of this impressive maze. \n" +
                "Got it? Nice, let’s move along. " 
        ));
        floors.put("-1.4", new Floor(420, -1, 4, false, false, true, true, false, true,
                
                "Name: Sindragosa’s lair \n" 
                + "It seems like you’ve entered the lair of Sindragosa, Sindragosa is a mighty frost wyrm who once ruled the world. \n"
                + "Before Sindragosa will even look upon your weak body, you must defeat her goblin servants first.\n"
                + "The easiest way to kill them is to use an AoE attack, sadly this game isn’t in that stage yet, so you’ll have to take them out one by one. "
        ));
        floors.get("-1.4").setEnemy(new Enemy().spawnEnemy());
        floors.put("0.4", new Floor(47, 0, 4, false, false, true, true, false, false,
                
                "Name: Lord von Apache’s kitchen\n"
                + "You’ve discovered another location of Lord von Apache! This is said to be his ‘kitchen’ or armory, whatever you prefer.\n"
                + "You might be able to find some equipment that will become handy within the next few moves. ‘Spoiler alert!’ " 
        ));
        floors.put("1.4", new Floor(0, 1, 4, false, false, true, false, true, true,
                
                "Name: The home of your middle school teacher\n" 
                + "Remember that teacher you had a crush on in middle school? \n" 
                + "We’re now in her home, look at all these cats, she must be a little lonely huh?\n" 
                + "Wait, what the hell is that over there? Is that one of Lucas Kuhn’s tools!" 
        ));
        floors.get("1.4").setEnemy(new Enemy().spawnEnemy());
        
        //Here we put our chest, so if you find it the game ends and let's you know that you won the game
        while(gameRunning)
        {
            Floor floor = floors.get(player.getPosition());
            output.healing(player.getMaxHp());
            if(floor.hasChest())
            {
                gameRunning = false;
                output.floorDescription(floor);
                output.winText();
                continue;
            }
            
            output.floorDescription(floor);
            //If there's an enemy we handle it here
            if(floor.gethasEnemy())
            {
                combat.firstHit(player);
                output.combatStart(floor.getEnemy());
                output.combat("", player.getWeapon(), combat, player, floor.getEnemy(), player.getInventory());
                if(player.getHp() <= 0)
                {
                    output.gameOver();
                    gameRunning = false;
                    continue;
                }
                floor.setHasEnemy(false);
            }
            //Loot for each floor
            output.loot(floor);
            floor.giveGold(player);
            output.waysToGo(floor);
            output.playerInput(floor);
        }
    }
}
