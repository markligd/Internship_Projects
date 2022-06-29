package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class YellowSubmarine3 {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "src/main/resources/YellowSubmarine.txt";


        File file = new File(myFile);
        Scanner text = new Scanner(file);

        ArrayList<String> words = new ArrayList<String>();


        while (text.hasNextLine()) {
            String line = text.nextLine();
            line = line.replace(",", "");
            line = line.replace("\n ", "");
            line = line.replace("(", "").replace(")", "");
            line = line.toLowerCase();
            String[] wordsInLine = line.split(" ");
            for (String s : wordsInLine) {
                if (!words.contains(s)) {
                    words.add(s);
                }

            }
            words.sort(Comparator.comparing(String::length));


        }
        System.out.println(words);


        text.close();


    }


}
