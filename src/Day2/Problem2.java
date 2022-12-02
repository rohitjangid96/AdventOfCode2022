package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem2 {

    public static void main(String args[]) {

        /*
        1 for Rock, 2 for Paper, and 3 for Scissors
        3 draw
        6 win
        * */
        File file = new File("src/Day2/input2.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
            int score = 0;
            int strategy = 0;
            while (sc.hasNextLine()) {
            String data = sc.nextLine();

            switch (data.trim())
            {
                case "A X":
                    score = score + 1+3;
                    strategy = strategy + 3 + 0;
                    break;
                case "A Y":
                    score = score + 2+6;
                    strategy = strategy + 1+3;
                    break;
                case "A Z":
                    score = score + 3+0;
                    strategy = strategy + 2+6;
                    break;
                case "B X":
                    score = score + 1+0;
                    strategy = strategy + 1+0;
                    break;
                case "B Y":
                    score = score + 2+3;
                    strategy = strategy + 2+3;
                    break;
                case "B Z":
                    score = score + 3+6;
                    strategy = strategy + 3+6;
                    break;
                case "C X":
                    score = score + 1+6;
                    strategy = strategy + 2+0;
                    break;
                case "C Y":
                    score = score + 2+0;
                    strategy = strategy + 3+3;
                    break;
                case "C Z":
                    score = score + 3+3;
                    strategy = strategy + 1+6;
                    break;

            }

            }

            System.out.println("strategy "+ strategy);
            System.out.println("score  "+ score);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
