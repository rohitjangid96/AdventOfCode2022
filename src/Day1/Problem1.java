package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Problem1 {

    public static void main(String args[]) {
        File file = new File("src/Day1/input.txt");
        Scanner sc;


            try {
                sc = new Scanner(file);
                long max = Long.MIN_VALUE;
                long sum = 0;

                ArrayList<Long> allElves = new ArrayList<>();

                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    if (data.trim().isEmpty()) {
                        allElves.add(sum);
                        max = Math.max(max,sum);
                        sum =0;
                    }
                    else {
                        sum = sum + Long.parseLong(data.trim());
                    }
                }
                Collections.sort(allElves,Collections.reverseOrder());
                System.out.println("Max is " + allElves.get(0));
                long total =(allElves.get(0) + allElves.get(1) + allElves.get(2));
                System.out.println("Sum is " + total);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }

}

