package company.Task10DataTypes;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();


        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = (A.substring(0, 1)).toUpperCase() + A.substring(1);
        B = (B.substring(0, 1)).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
