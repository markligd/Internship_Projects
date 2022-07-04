package company.Task9Abstract;
import java.util.*;


abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class newBook extends Book{
    void setTitle(String s){
        title=s;
    }
}

public class Main{

    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        String titleInput=scanner.nextLine();
        newBook newNovel=new newBook();
        System.out.println("The title is: "+newNovel.getTitle());
        newNovel.setTitle(titleInput);

    }
}