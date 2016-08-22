package stringpackage;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by harshita on 21/8/16.
 */
public class Count {

    private FileReader file;
    private Map<String, Integer> m = new HashMap<>();

    public Count(FileReader file, Map<String, Integer> m) {
        this.file = file;
        this.m = m;


    }

    public FileReader getFile() {
        return file;
    }

    public void setFile(FileReader file) {
        this.file = file;
    }

    public Map<String, Integer> getM() {
        return m;
    }

    public void setM(Map<String, Integer> m) {
        this.m = m;
    }

    public void findWord() {

        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\s+|\\.|\\,|\\;|\\:|\\'|\\?|\\!");


        while (sc.hasNext()) {
            String str = sc.next();
            str = str.toLowerCase();             //to ignore cases

            if (m.containsKey(str)) {          //if key already exists in map
                Integer count = m.get(str);    //get its value
                m.put(str, count + 1);         //increment value and store the key-value
            } else {
                m.put(str, 1);                 //if key does not exist add key-value to map
            }

        }


    }

    public void printMap(int numberOfOccurences) {
        System.out.println("KEY : VALUE");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= numberOfOccurences) {

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }
}
