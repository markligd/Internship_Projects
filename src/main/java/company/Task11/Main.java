package company.Task11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            try{
                int x = new Integer(scanner.nextInt());
                int y = new Integer(scanner.nextInt());
                System.out.println((x/y));
            }catch (InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }

        }catch(Exception e){
            System.out.println(e);
        }






    }
}
