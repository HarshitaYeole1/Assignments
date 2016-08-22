package stringpackage;
/**
 * Created by harshita on 21/8/16.
 */

import stringpackage.Count;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StringCount {

    public static void main(String[] args) throws IOException {

        //Write content into file
        FileWriter f = new FileWriter("input.txt");
        f.append("Hello, my name is Harshita Yeole. I am a Software Engineer. I am an Engineer from Cummins college. I work in Equal Experts. Equal Experts is an excellent company. Equal experts and I would have a long way ahead. I am a Software Engineer in Equal Experts.");
        f.close();

        //read contents of value
        FileReader file = new FileReader("input.txt");

        //ask for occurence count to the user
        System.out.println("Enter the minimum number of occurence: ");
        Scanner sc = new Scanner(System.in);
        int numberOfOccurence = sc.nextInt();

        Map<String, Integer> m = new HashMap<>();
        Count count = new Count(file, m);

        count.findWord();
        count.printMap(numberOfOccurence);
        file.close();

    }


}
