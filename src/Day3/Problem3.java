package Day3;

import java.io.File;
import java.util.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {

    public static void main(String args[])  {

        File file = new File("src/Day3/input3.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
            int sum =0;
            int i=0;
            ArrayList<String> rucksackList = new ArrayList<>();
            while(sc.hasNextLine())
            {
                String rucksack = sc.nextLine();
                rucksackList.add(rucksack);
                int length = rucksack.length();
                String comp1 = rucksack.substring(0, length /2);
                String comp2 = rucksack.substring(length /2, length);
                char[] comp1CharArray = comp1.toCharArray();

                char[] comp2CharArray = comp2.toCharArray();

                Set<Character> firstStringSet = new TreeSet<>();

                Set<Character> secondStringSet = new TreeSet<>();

                for (char c : comp1CharArray)
                {
                    firstStringSet.add(c);
                }

                for (char c : comp2CharArray)
                {
                    secondStringSet.add(c);
                }

                firstStringSet.retainAll(secondStringSet);
                sum = getSum(sum, firstStringSet);

            }
            System.out.println(sum);

            int groupSum = 0;
            for(int j =0; j<rucksackList.size();j++)
            {

                char [] first = rucksackList.get(j).toCharArray();
                char [] second = rucksackList.get(++j).toCharArray();
                char [] third = rucksackList.get(++j).toCharArray();

                Set<Character> firstStringSet = new TreeSet<>();

                Set<Character> secondStringSet = new TreeSet<>();

                Set<Character> thirdStringSet = new TreeSet<>();

                for (char c : first)
                {
                    firstStringSet.add(c);
                }

                for (char c : second)
                {
                    secondStringSet.add(c);
                }

                for (char c : third)
                {
                    thirdStringSet.add(c);
                }
                firstStringSet.retainAll(secondStringSet);
                firstStringSet.retainAll(thirdStringSet);

                groupSum = getSum(groupSum, firstStringSet);

            }
            System.out.println("groupSum is " +groupSum);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int getSum(int groupSum, Set<Character> firstStringSet) {
        char common = (char) firstStringSet.toArray()[0];
        int value =0;
        if(common >=97 ) {
            value = common - 'a' + 1;
            groupSum +=value;
        }
        else
        {
            value = common - 'A'  + 27;
            groupSum +=value;
        }
        return groupSum;
    }
}
