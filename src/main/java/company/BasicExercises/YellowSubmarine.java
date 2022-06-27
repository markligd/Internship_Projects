package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class YellowSubmarine {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "src/main/resources/YellowSubmarine.txt";


        File file = new File(myFile);
        Scanner text = new Scanner(file);
        HashMap<String, Integer> words = new HashMap<>();


        while (text.hasNextLine()) {
            String line = text.nextLine();
            line = line.replace(",", "");
            line = line.replace("\n ", "");
            line = line.replace("(", "").replace(")", "");
            line = line.toLowerCase();
            String[] wordsInLine = line.split(" ");
            for (String s : wordsInLine) {
                if (!words.containsKey(s)) {
                    words.put(s, 1);
                } else {
                    words.put(s, words.get(s) + 1);
                }
            }


        }
        System.out.println(words);


        text.close();


    }


}
