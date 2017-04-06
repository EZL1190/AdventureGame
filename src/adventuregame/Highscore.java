/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Shxnna
 */
public class Highscore {
    public void Highscore(PlayerV2 player){
     try {
            FileWriter writer = new FileWriter("Scores", true);
            writer.write("score: "+player.getGold());
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

}
