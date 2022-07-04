package company.Task10DataTypes;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String newString = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(newString.substring(start,end));


    }


}

