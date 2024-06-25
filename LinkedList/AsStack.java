import java.util.*;
import java.util.LinkedList;



public class AsStack{
    public static void main(String args[]){
         LinkedList<String> fruits=new LinkedList<>();

         fruits.add("mango");
         fruits.add("orange");
         fruits.add("apple");
         fruits.add("grape");
         fruits.add("pear");
         fruits.add("banana");
        System.out.println(fruits);

        //Last IN Last Out

        System.out.println(fruits.removeLast());
        System.out.println(fruits.removeLast());
        System.out.println(fruits.removeLast());
        System.out.println(fruits.removeLast());
        System.out.println(fruits.removeLast());
        System.out.println(fruits.removeLast());
        
    }
}

/*OUTPUT

[mango, orange, apple, grape, pear, banana]
banana
pear
grape
apple
orange
mango

 */