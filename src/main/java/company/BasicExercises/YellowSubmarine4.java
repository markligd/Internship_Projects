package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class YellowSubmarine4 {

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
                words.add(s);
                words.remove("yellow");
                words.remove("submarine");

            }


        }
        System.out.println(words);


        text.close();


    }


}
