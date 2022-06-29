package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class YellowSubmarine3_2 {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "src/main/resources/YellowSubmarine.txt";
        File file = new File(myFile);
        Scanner text = new Scanner(file);
        HashSet<String> words = new HashSet();


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

        ArrayList<String> newWords = new ArrayList<>(words);
        newWords.sort(Comparator.comparing(String::length));
        System.out.println(newWords);


        text.close();


    }


}
