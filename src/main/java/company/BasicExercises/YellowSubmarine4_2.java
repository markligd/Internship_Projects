package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class YellowSubmarine4_2 {

    public static void main(String[] args) throws FileNotFoundException {


        String myFile = "src/main/resources/YellowSubmarine.txt";

        File file = new File(myFile);
        Scanner text = new Scanner(file);
        ArrayList words = new ArrayList<>();


        while (text.hasNextLine()) {
            String line = text.nextLine();
            line = line.replace(",", "");
            line = line.replace("\n ", "");
            line = line.replace("(", "").replace(")", "");
            line = line.toLowerCase();
            String[] wordsInLine = line.split(" ");

            for (String s : wordsInLine) {
                words.add(s);

            }

        }
        words.removeIf(word -> (word.equals("yellow") || word.equals("submarine")));


        System.out.println(words);


        text.close();


    }


}
