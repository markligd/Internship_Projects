package com.company.BasicExercises;

public class StringReverse {
    public static void main (String[] args) {
        String stringToRevers1= "I’m going to go to school today morning1.";
        String stringToRevers2= "I’m going to go to school today morning2.";
        System.out.println("Reversed sentence:" + (reversedSentence1(stringToRevers1)));
        System.out.println("Reversed sentence:" + (reversedSentence2(stringToRevers2)));


        String a = new StringBuilder("I’m going to go to school today morning3.").reverse().toString();
        System.out.println("Reversed sentence:" +  a);

    }
    public static String reversedSentence1(String sentence){
        String newstr="";
        char newchar;

        System.out.print("Original sentence: ");
        System.out.println(sentence);

        for (int i=0; i<sentence.length(); i++)
        {
            newchar= sentence.charAt(i);
            newstr= newchar + newstr; //by iterate-> going with first letters to right
        }
        return newstr;
    }

    public static String reversedSentence2(String sentence) {
        String newstr = "";

        System.out.print("\nOriginal sentence: ");
        System.out.println(sentence);
        char [] pom2 = sentence.toCharArray();
        for (int i = pom2.length - 1; i >= 0; i--) {
            newstr += pom2[i];
        }
        return newstr +"\n";
    }

}



