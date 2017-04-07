/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Shxnna
 */
public class Highscore {

    private static final File H_FILE = new File("highscore.txt");

    public static void addScore(String name, int score) {
        try (PrintWriter out = new PrintWriter(new FileWriter(H_FILE, true))) {
            out.println(name + ": " + score);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static ArrayList<String> getHighScores() {
        try (Scanner in = new Scanner(new FileReader(H_FILE))) {
            ArrayList<String> list = new ArrayList<>();
            while (in.hasNext()) {
                String line = in.nextLine();
                list.add(line + "\n");
            }
            return list;
        } catch (IOException ex) {
            if (true) {
                ex.printStackTrace();
            }
            System.exit(1);
            return null; // Unreachable
        }
    }

    public void sortScores() throws FileNotFoundException {
        Collections.sort(getHighScores());
        Collections.reverse(getHighScores());

    }
}
