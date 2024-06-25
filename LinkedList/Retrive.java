import java.util.*;
import java.util.LinkedList;



public class Retrive{
    public static void main(String args[]){
         LinkedList<String> birds=new LinkedList<>();

         birds.add("hen");
         birds.add("peacock");
         birds.add("eagle");
         birds.add("penguin");
         birds.add("swam");

         //retrive the both end elements but not remove

         System.out.println(birds.getFirst());
         System.out.println(birds.getLast());

         System.out.println(birds);
         System.out.println(birds.size());

         //last index size
         System.out.println(birds.size()-1);

         
    }
}

/*OUTPUT

hen
swam
[hen, peacock, eagle, penguin, swam]
5
4

 */