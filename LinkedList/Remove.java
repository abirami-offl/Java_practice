import java.util.*;
import java.util.LinkedList;



public class Remove{
    public static void main(String args[]){
         LinkedList<String> animals=new LinkedList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("rabbit");
        animals.add("tiger");
        animals.add("lion");
        animals.add("zebra");
        animals.add("elephant");

        //remove

        animals.remove();
        System.out.println(animals);
        
        animals.remove(3);
        System.out.println(animals);

        animals.remove("zebra");
        System.out.println(animals);

        System.out.println(animals.remove(3));

        //removeAll

        animals.removeAll(animals);
        System.out.println(animals);

    }
}
/*OUTPUT

[cat, rabbit, tiger, lion, zebra, elephant]
[cat, rabbit, tiger, zebra, elephant]
[cat, rabbit, tiger, elephant]
elephant
[]

 */