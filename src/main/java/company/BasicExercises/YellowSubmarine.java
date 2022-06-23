package company.BasicExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YellowSubmarine {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "src/main/resources/YellowSubmarine.txt";


        File file = new File(myFile);
        int counter = 0;
        Scanner text = new Scanner(file);
        Scanner newword = new Scanner(System.in);
        String word = newword.nextLine();


        while(text.hasNextLine()){
            String line = text.nextLine();
            line = line.replace(",", "");
            line = line.replace("\n ", "");
            line = line.replace("(", "");
            line = line.replace(")", "");
            line = line.toLowerCase();
            String [] pom = line.split(" ");
            for (String c: pom) {
                System.out.println(c);
                if (c.equals(word)) {
                    counter++;

                }

            }

        }
        System.out.println(counter);

        text.close();




    }


}
