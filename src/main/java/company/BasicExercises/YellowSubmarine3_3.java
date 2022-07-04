package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class YellowSubmarine3_3 {

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

        List<String> sorted = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sorted);




        text.close();


    }


}
