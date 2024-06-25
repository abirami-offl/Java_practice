import java.util.*;
import java.util.LinkedList;



public class Replace{
    public static void main(String args[]){
         LinkedList<String> countries=new LinkedList<>();

         countries.add("japan");
         countries.add("korea");
         countries.add("thailand");
         countries.add("india");
         countries.add("china");
         System.out.println(countries);

         //replace
         countries.set(2,"germany");
         System.out.println(countries);


         //add to index without replace
         countries.add(3,"spain");
         System.out.println(countries);

    }
    }

    /*OUTPUT
      
    [japan, korea, thailand, india, china]
    [japan, korea, germany, india, china]
    [japan, korea, germany, spain, india, china]

     */