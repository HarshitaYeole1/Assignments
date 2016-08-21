package stringpackage;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by harshita on 21/8/16.
 */
public class Count {


    public void findWord(FileReader file, int numberOfOccurence) {

        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\s+|\\.|\\,|\\;|\\:|\\'|\\?|\\!");
        Map<String, Integer> m = new HashMap<>();

        while (sc.hasNext()) {
            String str = sc.next();
            if (m.containsKey(str)) {          //if key already exists in map
                Integer count = m.get(str);    //get its value
                m.put(str, count + 1);         //increment value and store the key-value
            } else {
                m.put(str, 1);                 //if key does not exist add key-value to map
            }


        }
        System.out.println("KEY : VALUE");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= numberOfOccurence) {

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }
}
